package com.betsol.myconnect.portal.controller;
import com.portal.model.Users;

import UserService;

public class UserController extends Rewuest{
	private final ObjectMapper mapper = new ObjectMapper();
	UserService userService = new UserService();
	public int create_user(Users user) {
		//Object to JSON in file
		JsonNode node= objectMapper.valueToTree(details);
		User userToCreate = jsonObjectMapper.treeToValue(node, User.class);
		userService.createUser(userToCreate);
		//Object to JSON in String
		String jsonInString = mapper.writeValueAsString(user);
		int id = create(user);
		return id;
	}
}