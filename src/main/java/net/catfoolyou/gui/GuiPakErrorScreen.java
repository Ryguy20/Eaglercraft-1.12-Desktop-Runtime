package net.catfoolyou.gui;

import java.io.IOException;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.gui.*;

public class GuiPakErrorScreen extends GuiScreen
{
    /**
     * Adds the buttons (and other controls) to the screen in question. Called when the GUI is displayed and when the
     * window resizes, the buttonList is cleared beforehand.
     */
    public void initGui()
    {
        this.buttonList.clear();
        this.buttonList.add(new GuiButton(0, width / 2 - 100, height / 6 + 168, I18n.format("Go back")));
    }

    /**
     * Called by the controls from the buttonList when activated. (Mouse pressed for buttons)
     */
    protected void actionPerformed(GuiButton button) throws IOException
    {
        if (button.id == 0)
        {
            this.mc.displayGuiScreen(new GuiWorldSelection(this));
        }
    }

    /**
     * Fired when a key is typed (except F11 which toggles full screen). This is the equivalent of
     * KeyListener.keyTyped(KeyEvent e). Args : character (character on the key), keyCode (lwjgl Keyboard key code)
     */
    protected void keyTyped(char typedChar, int keyCode) throws IOException
    {
    }

    /**
     * Draws the screen and all the components in it.
     */
    public void drawScreen(int mouseX, int mouseY, float partialTicks)
    {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRenderer, "EPK files not supported!", this.width / 2, this.height / 4 - 60 + 20, 16777215);
        this.drawString(this.fontRenderer, "Eagler PAK files (.epk) are not yet supported in this version.", this.width / 2 - 140, this.height / 4 - 60 + 60 + 0, 10526880);
        this.drawString(this.fontRenderer, "Convert them to regular zip files by importing them into", this.width / 2 - 140, this.height / 4 - 60 + 60 + 18, 10526880);
        this.drawString(this.fontRenderer, "Lax1dude's EaglercraftX 1.8 client and then exporting", this.width / 2 - 140, this.height / 4 - 60 + 60 + 27, 10526880);
        this.drawString(this.fontRenderer, "them as .zip files that can then be read by Eaglercraft 1.12.", this.width / 2 - 140, this.height / 4 - 60 + 60 + 36, 10526880);
        this.drawString(this.fontRenderer, "After that you can import them as regular vanilla worlds.", this.width / 2 - 140, this.height / 4 - 60 + 60 + 54, 10526880);
	 	this.drawString(this.fontRenderer, "EPK file support will be added in later updates of the", this.width / 2 - 140, this.height / 4 - 60 + 60 + 63, 10526880);
        this.drawString(this.fontRenderer, "Eaglercraft 1.12 runtime.", this.width / 2 - 140, this.height / 4 - 60 + 60 + 72, 10526880);
        //this.drawString(this.fontRenderer, "", this.width / 2 - 140, this.height / 4 - 60 + 60 + 81, 10526880);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }
}
