package com.abstraction;

public class SocialApp implements SocialReelsFeature , SocialChatFeature {
	@Override
	public void uploadReel() {
		System.out.println(" Reel uploaded successfully 🎥 ");
	}
	@Override
	public void sendMessage() {
		System.out.println(" Message sent successfully 💬 ");
	}
	
}
