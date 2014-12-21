package com.featurive.bramcraft.client.handler;

import com.featurive.bramcraft.reference.Keys;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class KeyInputHandler
{
    @SideOnly(Side.CLIENT)
    private static Keys getPressedKey()
    {
    //    if(KeyBindings.fly.isPressed()) {
    //        return Keys.FLY;
    //    }
        return Keys.UNKNOWN;
    }

    @SubscribeEvent
    public void handleKeyInputEvent(InputEvent.KeyInputEvent event)
    {
        //EntityPlayer player = FMLClientHandler.instance().getClientPlayerEntity();
        //
        //  if(getPressedKey() == Keys.FLY){
        //    if(player.capabilities.allowFlying){
        //        player.addChatMessage(new ChatComponentText("Flying set to " + EnumChatFormatting.RED + "false"));
        //        player.capabilities.allowFlying = false;
        //        player.capabilities.isFlying = false;
        //        player.fallDistance = 0F;
        //    }else{
        //        player.addChatMessage(new ChatComponentText("Flying set to " + EnumChatFormatting.GREEN + "true"));
        //        player.capabilities.allowFlying = true;
        //        player.fallDistance = 0F;
        //    }
        //}
    }
}