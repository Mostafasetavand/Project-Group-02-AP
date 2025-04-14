package NPCS;

public class NPCInteraction {
    public void talkToNPC(NPC npc) {
        System.out.println("Talking to " + npc.getName() + "...");
        npc.displayMissions();
        npc.displayGifts();
    }

    public void completeMissionForNPC(GamePlayer player, NPC npc, String mission) {
        player.completeMission(npc, mission);
    }

    public void giveGiftToNPC(GamePlayer player, NPC npc, String gift) {
        player.giveGift(npc, gift);
    }
}
