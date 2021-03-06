import org.rsmod.plugins.api.model.ui.gameframe.GameFrameList
import org.rsmod.plugins.api.model.ui.gameframe.GameFrameResizeClassic

val frames: GameFrameList by inject()

frames.register {
    type = GameFrameResizeClassic
    topLevel = "game_frame_resize_classic"
    component {
        name = "chatbox"
        inter = "chatbox"
        target = "chatbox_normal"
    }
    component {
        name = "interface_651"
        inter = "interface_651"
        target = "interface_651_component"
    }
    component {
        name = "chatbox_username"
        inter = "chatbox_username"
        target = "chatbox_username"
    }
    component {
        name = "frame_orbs"
        inter = "frame_orbs"
        target = "frame_orbs"
    }
    component {
        name = "pvp_skull"
        inter = "pvp_skull"
        target = "pvp_skull"
    }
    component {
        name = "attack_tab"
        inter = "attack_tab"
        target = "attack_tab"
    }
    component {
        name = "skill_tab"
        inter = "skill_tab"
        target = "skill_tab"
    }
    component {
        name = "activity_tab"
        inter = "activity_tab"
        target = "activity_tab"
    }
    component {
        name = "inventory_tab"
        inter = "inventory_tab"
        target = "inventory_tab"
    }
    component {
        name = "equipment_tab"
        inter = "equipment_tab"
        target = "equipment_tab"
    }
    component {
        name = "prayer_tab"
        inter = "prayer_tab"
        target = "prayer_tab"
    }
    component {
        name = "magic_tab"
        inter = "magic_tab"
        target = "magic_tab"
    }
    component {
        name = "clan_chat_tab"
        inter = "clan_chat_tab"
        target = "clan_chat_tab"
    }
    component {
        name = "social_tab"
        inter = "social_tab"
        target = "social_tab"
    }
    component {
        name = "community_tab"
        inter = "community_tab"
        target = "community_tab"
    }
    component {
        name = "logout_tab"
        inter = "logout_tab"
        target = "logout_tab"
    }
    component {
        name = "settings_tab"
        inter = "settings_tab"
        target = "settings_tab"
    }
    component {
        name = "emotes_tab"
        inter = "emotes_tab"
        target = "emotes_tab"
    }
    component {
        name = "music_tab"
        inter = "music_tab"
        target = "music_tab"
    }
    component {
        name = "quest_tab"
        inter = "quest_tab"
        target = "quest_tab"
    }
}
