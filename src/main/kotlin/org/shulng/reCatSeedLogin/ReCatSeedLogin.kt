package org.shulng.reCatSeedLogin

import cn.handyplus.lib.adapter.HandySchedulerUtil
import org.bukkit.plugin.java.JavaPlugin

class ReCatSeedLogin : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        HandySchedulerUtil.init(this);
        System.out.println("\033[38;2;0;255;0mLoaded RCSL\033[0m");
    }

    override fun onDisable() {
        // Plugin shutdown logic
        System.out.println("\033[38;2;255;0;0mStoped RCSL\033[0m");
    }
}
