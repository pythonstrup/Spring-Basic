package com.bigbell.springdemo;

import java.util.Random;

public class GoodFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		String[] fortunes = {"You can do it! cheer up!", "it will be nice day!", "Go! and Run!"};
		Random random = new Random();
		String randomSentece = fortunes[random.nextInt(3)];
		return randomSentece;
	}

}
