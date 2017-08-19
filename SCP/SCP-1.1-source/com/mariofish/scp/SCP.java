package zdoctor.scp;

import zdoctor.scp.armor.ArmorGasMask;
import zdoctor.scp.armor.ArmorNVGoggles;
import zdoctor.scp.armor.ArmorRiotMask;
import zdoctor.scp.armor.ArmorTest;
import zdoctor.scp.blocks.BlockDeco;
import zdoctor.scp.blocks.BlockDeco2;
import zdoctor.scp.blocks.BlockDeco3;
import zdoctor.scp.blocks.BlockDeskSmall;
import zdoctor.scp.blocks.BlockSCP079;
import zdoctor.scp.blocks.BlockSCP895;
import zdoctor.scp.blocks.BlockSCPQuack;
import zdoctor.scp.blocks.Button;
import zdoctor.scp.blocks.Door;
import zdoctor.scp.blocks.Door2;
import zdoctor.scp.blocks.tileentity.TileEntityDoorClosed2;
import zdoctor.scp.items.ItemKeyCard;
import zdoctor.scp.items.ItemMedkit;
import zdoctor.scp.proxy.CommonProxy;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;

@cpw.mods.fml.common.Mod(modid="scp", name="SCP", version="1.1")
public class SCP
{
  @cpw.mods.fml.common.Mod.Instance("scp")
  public static SCP instance;
  @cpw.mods.fml.common.SidedProxy(clientSide="zdoctor.scp.proxy.ClientProxy", serverSide="zdoctor.scp.proxy.CommonProxy")
  public static CommonProxy proxy;
  
  
 
  public static Item test_helm;
  
  public static Item itemLevel1Card;
  public static Item itemLevel2Card;
  public static Item itemLevel3Card;
  public static Item itemLevel4Card;
  public static Item itemLevel5Card;
  public static Item itemLevelMasterCard;
  public static Item itemMasterCard;
  public static Item itemMedkit;
  
  @Mod.EventHandler
  public void preInit(FMLPreInitializationEvent event)
  {
    FMLCommonHandler.instance().bus().register(new zdoctor.scp.proxy.ClientProxy());
  }
  




























  public SCP()
  {
    ItemArmor.ArmorMaterial Useless = net.minecraftforge.common.util.EnumHelper.addArmorMaterial("useless", 0, new int[] { 0, 0, 0, 0 }, 0);
    

    DecoBlocks = new BlockDeco().setUnlocalizedName("DecoBlocks");
    DecoBlocks2 = new BlockDeco2().setUnlocalizedName("DecoBlocks2");
    DecoBlocks3 = new BlockDeco3().setUnlocalizedName("DecoBlocks3");
    armorNVHelm = new ArmorNVGoggles(Useless, armorNVHelmID, 0).setUnlocalizedName("NVHelm");
    armorGMHelm = new ArmorGasMask(Useless, 1, 0).setUnlocalizedName("GMHelm");
    armorRMHelm = new ArmorRiotMask(Useless, armorRMHelmID, 0).setUnlocalizedName("RMHelm");
    test_helm = new ArmorTest(Useless, 1, 0).setUnlocalizedName("test_helm");
    Door = new Door(Material.IRON, false).setCreativeTab(tabscp);
    DoorClosed = new Door(Material.IRON, true);
    Door2 = new Door2(Material.IRON, false).setCreativeTab(tabscp);
    DoorClosed2 = new Door2(Material.IRON, true);
    blockDeskSmall = new BlockDeskSmall().setUnlocalizedName("DeskSmall");
    blockSCP079 = new BlockSCP079().setUnlocalizedName("SCP079");
    blockSCP895 = new BlockSCP895().setUnlocalizedName("SCP895");
    blockSCPQuack = new BlockSCPQuack().setUnlocalizedName("SCPQuack");
    ButtonOff = new Button(Material.IRON, false).setCreativeTab(tabscp);
    ButtonOn = new Button(Material.IRON, true);
    itemLevel1Card = new ItemKeyCard().setUnlocalizedName("ItemLevel1Card").getByNameOrId("scp:level1card").setCreativeTab(tabscp);
    itemLevel2Card = new ItemKeyCard().setUnlocalizedName("ItemLevel2Card").getByNameOrId("scp:level2card").setCreativeTab(tabscp);
    itemLevel3Card = new ItemKeyCard().setUnlocalizedName("ItemLevel3Card").getByNameOrId("scp:level3card").setCreativeTab(tabscp);
    itemLevel4Card = new ItemKeyCard().setUnlocalizedName("ItemLevel4Card").getByNameOrId("scp:level4card").setCreativeTab(tabscp);
    itemLevel5Card = new ItemKeyCard().setUnlocalizedName("ItemLevel5Card").getByNameOrId("scp:level5card").setCreativeTab(tabscp);
    itemLevelMasterCard = new ItemKeyCard().setUnlocalizedName("ItemLevelMasterCard").getByNameOrId("scp:levelmastercard").setCreativeTab(tabscp);
    itemMasterCard = new ItemKeyCard().setUnlocalizedName("ItemMasterCard").getByNameOrId("scp:mastercard").setCreativeTab(tabscp);
    itemMedkit = new ItemMedkit().setUnlocalizedName("ItemMedkit").getByNameOrId("scp:medkit").setCreativeTab(tabscp);
    

    GameRegistry.registerItem(itemMedkit, itemMedkit.getUnlocalizedName().substring(5));
    GameRegistry.registerItem(itemLevel1Card, itemLevel1Card.getUnlocalizedName().substring(5));
    GameRegistry.registerItem(itemLevel2Card, itemLevel2Card.getUnlocalizedName().substring(5));
    GameRegistry.registerItem(itemLevel3Card, itemLevel3Card.getUnlocalizedName().substring(5));
    GameRegistry.registerItem(itemLevel4Card, itemLevel4Card.getUnlocalizedName().substring(5));
    GameRegistry.registerItem(itemLevel5Card, itemLevel5Card.getUnlocalizedName().substring(5));
    GameRegistry.registerItem(itemLevelMasterCard, itemLevelMasterCard.getUnlocalizedName().substring(5));
    GameRegistry.registerItem(itemMasterCard, itemMasterCard.getUnlocalizedName().substring(5));
    GameRegistry.registerBlock(DecoBlocks, zdoctor.scp.items.ItemBlockDeco.class, DecoBlocks.getUnlocalizedName().substring(5));
    GameRegistry.registerBlock(DecoBlocks2, zdoctor.scp.items.ItemBlockDeco2.class, DecoBlocks2.getUnlocalizedName().substring(5));
    GameRegistry.registerBlock(DecoBlocks3, zdoctor.scp.items.ItemBlockDeco3.class, DecoBlocks3.getUnlocalizedName().substring(5));
    GameRegistry.registerItem(armorNVHelm, "NVHelm");
    GameRegistry.registerItem(armorGMHelm, "GMHelm");
    GameRegistry.registerItem(armorRMHelm, "RMHelm");
    GameRegistry.registerBlock(Door, "Door");
    GameRegistry.registerBlock(DoorClosed, "DoorClosed");
    GameRegistry.registerBlock(Door2, "Door2");
    GameRegistry.registerBlock(DoorClosed2, "DoorClosed2");
    

    GameRegistry.registerTileEntity(zdoctor.scp.blocks.tileentity.TileEntityDoor.class, "TileEntityDoor");
    GameRegistry.registerTileEntity(zdoctor.scp.blocks.tileentity.TileEntityDoorClosed.class, "TileEntityDoorClosed");
    GameRegistry.registerTileEntity(zdoctor.scp.blocks.tileentity.TileEntityDoor2.class, "TileEntityDoor2");
    GameRegistry.registerTileEntity(TileEntityDoorClosed2.class, "TileEntityDoorClosed2");
    GameRegistry.registerBlock(blockSCP079, "BlockSCP079");
    GameRegistry.registerBlock(blockSCP895, "BlockSCP895");
    GameRegistry.registerBlock(blockSCPQuack, "BlockSCPQuack");
    GameRegistry.registerBlock(blockDeskSmall, "DeskSmall");
    GameRegistry.registerTileEntity(zdoctor.scp.blocks.tileentity.TileEntityDeskSmall.class, "TileEntityDeskSmall");
    GameRegistry.registerTileEntity(zdoctor.scp.blocks.tileentity.TileEntitySCP079.class, "TileEntitySCP079");
    GameRegistry.registerTileEntity(zdoctor.scp.blocks.tileentity.TileEntitySCP895.class, "TileEntitySCP895");
    GameRegistry.registerTileEntity(zdoctor.scp.blocks.tileentity.TileEntitySCPQuack.class, "TileEntitySCPQuack");
  }
  






















  @Mod.EventHandler
  public void PreLoad(FMLPreInitializationEvent PreEvent)
  {
    zdoctor.scp.init.Entities.mainRegistry();
    



    proxy.registerRenderThings();
  }
  






  public static CreativeTabs tabscp = new CreativeTabs("tabscp")
  {
    public Item getTabIconItem() {
      return new ItemStack(SCP.armorGMHelm).getItem();
    }
  };
  
  @Mod.EventHandler
  public void init(FMLInitializationEvent event) {}
}


