package mmjp.fsm.ford.com.enroute.uber.modules.rider;

import com.google.gson.annotations.SerializedName;
import com.uber.sdk.android.core.auth.AccessTokenManager;

import java.io.Serializable;

public class UberRider implements Serializable {

    @SerializedName("accessToken")
    private AccessTokenManager accessTokenManager;

    public void setAccessTokenManager(AccessTokenManager manager){
        accessTokenManager = manager;
    }

    public AccessTokenManager getAccessTokenManager() {
        return accessTokenManager;
    }
}
