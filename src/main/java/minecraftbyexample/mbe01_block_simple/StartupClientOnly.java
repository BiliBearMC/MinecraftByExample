package minecraftbyexample.mbe01_block_simple;

import minecraftbyexample.usefultools.RenderTypeMBE;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

/**
 * User: The Grey Ghost
 * Date: 24/12/2014
 *
 *  See MinecraftByExample class for more information
 */
public class StartupClientOnly
{
  /**
   * Tell the renderer this is a solid block (default is translucent)
   * @param event
   */
  @SubscribeEvent
  public static void onClientSetupEvent(FMLClientSetupEvent event) {
    RenderTypeLookup.setRenderLayer(StartupCommon.blockSimple, RenderTypeMBE.SOLID());
  }
}
