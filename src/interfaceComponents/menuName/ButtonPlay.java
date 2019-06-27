package interfaceComponents.menuName;

import game_base.Screen;
import game_logic.LevelState;
import interfaceComponents.MenuButton;

import java.awt.Color;
import java.awt.Font;

import misc.BaseConfigLoader;


public class ButtonPlay extends MenuButton {
	public ButtonPlay () {
		super();
		
		this.setWidth(350);
		this.setHeight(70);
		this.setXPos(130);
		this.setXOffset(115);
		this.setYPos(570);
		this.setYOffset(47);
		
		this.setBorderSize(10);
		
		this.setColourBody(Color.GRAY);
		this.setColourBodyFiringOver(Color.BLACK);
		this.setColourBorder(Color.BLACK);
		this.setColourText(Color.BLACK);
		this.setColourTextMouseOver(Color.GRAY);
		
		this.setText("PLAY");
		this.setTextFont(new Font(Font.SANS_SERIF, Font.BOLD, 40));
	}
	
	public void clickedEvent() {
		LevelState.nextLevel();
		Screen.setScreen(1);
		BaseConfigLoader.save();
	}
}
