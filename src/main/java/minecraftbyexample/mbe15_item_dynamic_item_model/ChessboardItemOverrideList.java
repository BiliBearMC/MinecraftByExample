//package minecraftbyexample.mbe15_item_dynamic_item_model;
//
//import net.minecraft.client.renderer.model.IBakedModel;
//import net.minecraft.client.renderer.model.ItemOverride;
//import net.minecraft.client.renderer.model.ItemOverrideList;
//import net.minecraft.entity.LivingEntity;
//import net.minecraft.item.ItemStack;
//import net.minecraft.world.World;
//
//import java.util.List;
//
///**
// * Created by TGG on 20/10/2016.
// */
//public class ChessboardItemOverrideList extends ItemOverrideList {
//  public ChessboardItemOverrideList(List<ItemOverride> overridesIn)
//  {
//    super(overridesIn);
//  }
//
//  /**
//   *  handleItemState() is used to create/select a suitable IBakedModel based on the itemstack information.
//   *  Typically, this will extract NBT information from the itemstack and customise the model based on that.
//   *  It's probably safest to return a new model or at least an immutable one, rather than modifying the
//   *    originalModel passed in, in case the rendering is multithreaded (block rendering has this problem, for example).
//   * @param originalModel
//   * @param stack
//   * @param world
//   * @param entity
//   * @return
//   */
//  @Override
//  public IBakedModel getModelWithOverrides(IBakedModel originalModel, ItemStack stack, World world, LivingEntity entity)
//  {
//    int numberOfChessPieces = 0;
//    if (stack != null) {
//      numberOfChessPieces = stack.getCount();  // func_190916_E() will probably be called getStackSize() soon
//    }
//    return new ChessboardFinalisedModel(originalModel, numberOfChessPieces);
//  }
//
//
//}
