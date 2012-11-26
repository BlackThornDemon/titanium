package blackThornDemon.client;


import blackThornDemon.common.CommonProxyTutorial;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxyTutorial extends CommonProxyTutorial
{
    @Override
    public void registerRenderThings()
    {
     MinecraftForgeClient.preloadTexture("/titanium.png");
    }
}