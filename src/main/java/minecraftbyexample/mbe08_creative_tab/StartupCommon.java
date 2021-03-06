//package minecraftbyexample.mbe08_creative_tab;
//
//import net.minecraft.block.Block;
//import net.minecraft.block.BlockHardenedClay;
//import net.minecraft.item.*;
//import net.minecraft.item.SwordItem;
//import net.minecraft.item.Items;
//import net.minecraftforge.fml.common.registry.ForgeRegistries;
//import net.minecraftforge.fml.relauncher.Side;
//import net.minecraftforge.fml.relauncher.SideOnly;
//
///**
// * User: The Grey Ghost
// * Date: 24/12/2014
// *
// * The Startup classes for this example are called during startup, in the following order:
// *  preInitCommon
// *  preInitClientOnly
// *  initCommon
// *  initClientOnly
// *  postInitCommon
// *  postInitClientOnly
// *  See MinecraftByExample class for more information
// */
//public class StartupCommon
//{
//  public static ItemGroup customTab;               // will hold our first custom creative tab
//  public static AllMbeItemsTab allMbeItemsTab;        // will hold our second custom creative tab displaying all MBE item
//
//  public static Block testBlock;
//  public static BlockItem testItemBlock;  // the itemBlock corresponding to testBlock
//  public static Item testItem;
//
//  public static void preInitCommon()
//  {
//
////   Because the CreativeTabs class only has one abstract method, we can easily use an anonymous class.
////   For more information about anonymous classes, see this link:
////   http://docs.oracle.com/javase/tutorial/java/javaOO/anonymousclasses.html
////   To set the actual name of the tab, you have to go into your .lang file and add the line
////    itemGroup.mbe08_creative_tab=Gold Nugget Tab
////   where gold_nugget_tab is the unlocalized name of your creative tab, and Gold Nugget Tab
////   is the actual name of your tab
//   /*
//   * Note that there is no need to explicitly register the creative tabs themselves. When
//   * you make a new CreativeTabs object, it gets added automatically in the constructor of
//   * the CreativeTabs class.
//   */
//    customTab = new ItemGroup("mbe08_creative_tab") {
//      @Override
//      @OnlyIn(Dist.CLIENT)
//      public ItemStack getTabIconItem() {
//        return new ItemStack(Items.GOLD_NUGGET);
//      }
//    };
//
////  The lines below create a test block and item instance that are going to be added to the creative tabs.
////  An item can be listed on multiple tabs by overriding Item.getCreativeTabs()
////  A block can only be listed on one tab, unless you give it a custom ItemBlock which overrides .getCreativeTabs()
//    testBlock = new BlockHardenedClay().setUnlocalizedName("mbe08_creative_tab_block_unlocalised_name").setCreativeTab(customTab);
//    testBlock.setRegistryName("mbe08_creative_tab_block_registry_name");
//    ForgeRegistries.BLOCKS.register(testBlock);
//    // register the itemblock corresponding to the block
//    testItemBlock = new BlockItem(testBlock);
//    testItemBlock.setRegistryName(testBlock.getRegistryName());
//    ForgeRegistries.ITEMS.register(testItemBlock);
//
//    // add an item (an item without a corresponding block)
//    testItem = new SwordItem(Item.ToolMaterial.GOLD).setUnlocalizedName("mbe08_creative_tab_item_unlocalised_name").setCreativeTab(customTab);
//    testItem.setRegistryName("mbe08_creative_tab_item_registry_name");
//    ForgeRegistries.ITEMS.register(testItem);
//
//    allMbeItemsTab = new AllMbeItemsTab("mbe08_creative_tab_all_MBE");
//  }
//
//  public static void initCommon()
//  {
//  }
//
//  public static void postInitCommon()
//  {
//  }
//}
