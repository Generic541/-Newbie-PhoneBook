package kr.dothome.generic7.project;

/*
 *  _____  _                      ____              _    
 * |  __ \| |                    |  _ \            | |   
 * | |__) | |__   ___  _ __   ___| |_) | ___   ___ | | __
 * |  ___/| '_ \ / _ \| '_ \ / _ \  _ < / _ \ / _ \| |/ /
 * | |    | | | | (_) | | | |  __/ |_) | (_) | (_) |   < 
 * |_|    |_| |_|\___/|_| |_|\___|____/ \___/ \___/|_|\_\
 *
 *	Test version
 */

import kr.dothome.generic7.project.PhoneBookManager.PhoneBookDisplayManager;
import kr.dothome.generic7.project.PhoneBookManager.PhoneBookManager;

public class PhoneBook implements MENU_INPUT
{
	public static void main(String[] args)
	{
		PhoneBookDisplayManager.showMenu();
		PhoneBookManager manager = PhoneBookManager.getInst();
		int choice = PhoneBookManager.input.nextInt();
		
		while(true) {
		switch(choice)
		{
			case MENU_INPUT.INPUT:
				manager.inputInfo();
				break;
				
			case MENU_INPUT.DELETE:
				manager.deleteInfo();
				break;
				
			case MENU_INPUT.MODIFY:
				manager.modifyInfo();
				break;
				
			case MENU_INPUT.SEARCH:
				manager.searchInfo();
				break;
				
			case MENU_INPUT.EXIT:
				System.out.println("GoodBye");
				return;
		}
		}
	}
}
