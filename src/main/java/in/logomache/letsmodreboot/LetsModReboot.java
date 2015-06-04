package in.logomache.letsmodreboot;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import in.logomache.letsmodreboot.configuration.ConfigurationHandler;
import in.logomache.letsmodreboot.proxy.IProxy;
import in.logomache.letsmodreboot.reference.Reference;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class LetsModReboot {

  @Mod.Instance(Reference.MOD_ID)
  public static LetsModReboot instance;

  @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS,
              serverSide = Reference.SERVER_PROXY_CLASS)
  public static IProxy proxy;

  @Mod.EventHandler
  public void preInit(FMLPreInitializationEvent event) {
    ConfigurationHandler.init(event.getSuggestedConfigurationFile());
  }

  @Mod.EventHandler
  public void init(FMLInitializationEvent event) {

  }

  @Mod.EventHandler
  public void postInit(FMLPostInitializationEvent event) {

  }
}
