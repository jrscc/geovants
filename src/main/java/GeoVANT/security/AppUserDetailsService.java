package GeoVANT.security;

import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import GeoVANT.model.ResearcherCollector;
import GeoVANT.repository.ResearcherCollectorRepository;

@Service
public class AppUserDetailsService implements UserDetailsService{

	@Autowired
	private ResearcherCollectorRepository researcherCollectorRepository;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Optional<ResearcherCollector> researcherCollectorOptional = researcherCollectorRepository.findByEmail(email);
		ResearcherCollector researcherCollector = researcherCollectorOptional.orElseThrow(()-> new UsernameNotFoundException("user and/or password incorrect"));
		return new User(email, researcherCollector.getPassword(), getAllowance(researcherCollector));
	}

	private Collection<? extends GrantedAuthority> getAllowance(ResearcherCollector researcherCollector) {
		
		Set<SimpleGrantedAuthority> authorities = new HashSet<>();
		researcherCollector.getAllowance().forEach(p -> authorities.add(new SimpleGrantedAuthority(p.getDescription().toUpperCase())));
		return authorities;
	}

}
