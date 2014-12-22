package com.featurive.bramcraft.client.handler;

import com.featurive.bramcraft.reference.Keys;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

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