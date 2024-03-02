package committee.nova.vocalized.ayachi_nene;

import committee.nova.vocalized.common.registry.VocalizedRegistry;
import committee.nova.vocalized.common.voice.VoiceType;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fml.common.Mod;

@Mod(AyachiNene.MODID)
public class AyachiNene {
    public static final String MODID = "vocalized_ayachi_nene";
    public static final VoiceType AYACHI_NENE = new VoiceType(new ResourceLocation(MODID, "ayachi_nene"));

    public AyachiNene() {
        VocalizedRegistry.INSTANCE.registerVoiceType(AYACHI_NENE);
    }
}
