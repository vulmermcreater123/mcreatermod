package net.mcreator.crazystuff.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.Identifier;
import net.minecraft.network.chat.Component;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.client.input.KeyEvent;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphicsExtractor;

import net.mcreator.crazystuff.world.inventory.Chapter1guiMenu;
import net.mcreator.crazystuff.init.CrazyStuffModScreens;

public class Chapter1guiScreen extends AbstractContainerScreen<Chapter1guiMenu> implements CrazyStuffModScreens.FabricScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	private static final Identifier BACKGROUND = Identifier.parse("crazy_stuff:textures/screens/chapter_1gui.png");

	public Chapter1guiScreen(Chapter1guiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text, 232, 166);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	@Override
	public void extractRenderState(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.extractRenderState(guiGraphics, mouseX, mouseY, partialTicks);
	}

	@Override
	public void extractBackground(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.extractBackground(guiGraphics, mouseX, mouseY, partialTicks);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, BACKGROUND, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
	}

	@Override
	public boolean keyPressed(KeyEvent event) {
		int key = event.key();
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(event);
	}

	@Override
	protected void extractLabels(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY) {
		guiGraphics.text(this.font, Component.translatable("gui.crazy_stuff.chapter_1gui.label_heard_it_in_the_woods_far_from_a"), 6, 18, -12829636, false);
		guiGraphics.text(this.font, Component.translatable("gui.crazy_stuff.chapter_1gui.label_i_heard_it_scream_then_the_foots"), 7, 32, -12829636, false);
		guiGraphics.text(this.font, Component.translatable("gui.crazy_stuff.chapter_1gui.label_getting_closer_every_time"), 10, 51, -12829636, false);
		guiGraphics.text(this.font, Component.translatable("gui.crazy_stuff.chapter_1gui.label_its_wispering_in_my_ear"), 8, 70, -12829636, false);
		guiGraphics.text(this.font, Component.translatable("gui.crazy_stuff.chapter_1gui.label_there_is_no_escape"), 9, 86, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
	}
}