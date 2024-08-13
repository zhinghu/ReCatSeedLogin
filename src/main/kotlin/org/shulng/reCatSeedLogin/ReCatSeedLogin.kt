package org.shulng.reCatSeedLogin

import cn.handyplus.lib.adapter.HandySchedulerUtil
import org.bukkit.plugin.java.JavaPlugin

class ReCatSeedLogin : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        HandySchedulerUtil.init(this);
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
