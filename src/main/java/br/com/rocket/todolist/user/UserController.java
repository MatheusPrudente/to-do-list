package br.com.rocket.todolist.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * Modificadores
 * private
 * public
 * protected
 * */
@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private IUserRepository userRepository;

	@PostMapping("/")
	public ResponseEntity<?> create(@RequestBody UserModel userModel) {
		var user = userRepository.findByUsername(userModel.getUsername());

		if (user != null) {
			return ResponseEntity.status(400).body("The user already exists");
		}

		var userCreated = userRepository.save(userModel);
		return ResponseEntity.status(200).body(userCreated);
	}
}
