package sacred.mechmaster.block;

import sacred.mechmaster.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockInfo extends Block{
    public BlockInfo(int id, Material material) {
        super(id, material);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister register){
        blockIcon = register.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
    }
}