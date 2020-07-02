package asirammod;

import asirammod.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MOD_ID,name = Main.MOD_NAME,version = Main.MOD_VERSION)
public class Main {
	public static final String MOD_ID = "asirammod";
	public static final String MOD_NAME = "AsiramMod";
	public static final String MOD_VERSION = "1.0";
	public static final String MC_VERSION = "1.12.2";
	
	public static final String CLIENT_PROXY = "asirammod.proxy.ClientProxy";
	public static final String SERVER_PROXY = "asirammod.proxy.ServerProxy";
	public static final String COMMON_PROXY = "asirammod.proxy.CommonProxy";
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Main.CLIENT_PROXY,serverSide = Main.SERVER_PROXY)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {}
	
	@EventHandler
	public static void Init(FMLInitializationEvent event) {}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {}
}
