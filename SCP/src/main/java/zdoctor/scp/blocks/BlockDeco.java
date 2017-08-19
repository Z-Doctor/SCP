package zdoctor.scp.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import zdoctor.lazymodder.easy.blocks.EasyMetaBlock;
import zdoctor.lazymodder.easy.crafting.RecipeBuilder;
import zdoctor.lazymodder.easy.interfaces.IHaveRecipe;

public class BlockDeco extends EasyMetaBlock implements IHaveRecipe {
	static final String[] subBlocks = { "ctile", "ctileg", "floortile", "wallbottom", "wallmiddle", "walltop",
			"1162wall", "1162walla", "concrete", "pdfloor", "pdwallbottom", "pdwallmiddle", "pdwalltop", "red",
			"vent" };

	public BlockDeco() {
		super("DecoBlock1", subBlocks.length, Material.ROCK);
		setHardness(1.0F);
		SCPBlock.initBlock(this);
	}
	
	@Override
	public String getNameFromMeta(int meta) {
		return subBlocks[meta];
	}
	
	@Override
	public RecipeBuilder getRecipe() throws Exception {
		RecipeBuilder recipe = new RecipeBuilder(new ItemStack(this)).map("ddd"," a ", "sss").where('d', new ItemStack(Items.DIAMOND)).where('a', Items.APPLE).where('s', Items.STICK).buildShaped();
		return recipe;
	}
	
}
