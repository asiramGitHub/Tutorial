package asirammod.proxy;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import asirammod.Main;

@Mod.EventBusSubscriber(modid = Main.MOD_ID)
public abstract class CommonProxy {
	public void preInit(FMLPreInitializationEvent event) {
		
	}
	
	public void Init(FMLInitializationEvent event) {
		
	}
	
	public void PostInit(FMLPostInitializationEvent event) {
		
	}
	
	public void registerItemRenderer(Item item,int meta,String id) {}
}
