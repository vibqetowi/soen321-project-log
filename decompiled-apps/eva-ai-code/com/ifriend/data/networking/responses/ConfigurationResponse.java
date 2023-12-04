package com.ifriend.data.networking.responses;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ConfigurationResponse.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ifriend/data/networking/responses/ConfigurationResponse;", "", "friend", "Lcom/ifriend/data/networking/responses/ConfigurationFriendResponse;", "(Lcom/ifriend/data/networking/responses/ConfigurationFriendResponse;)V", "getFriend", "()Lcom/ifriend/data/networking/responses/ConfigurationFriendResponse;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ConfigurationResponse {
    private final ConfigurationFriendResponse friend;

    public static /* synthetic */ ConfigurationResponse copy$default(ConfigurationResponse configurationResponse, ConfigurationFriendResponse configurationFriendResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            configurationFriendResponse = configurationResponse.friend;
        }
        return configurationResponse.copy(configurationFriendResponse);
    }

    public final ConfigurationFriendResponse component1() {
        return this.friend;
    }

    public final ConfigurationResponse copy(ConfigurationFriendResponse friend) {
        Intrinsics.checkNotNullParameter(friend, "friend");
        return new ConfigurationResponse(friend);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ConfigurationResponse) && Intrinsics.areEqual(this.friend, ((ConfigurationResponse) obj).friend);
    }

    public int hashCode() {
        return this.friend.hashCode();
    }

    public String toString() {
        ConfigurationFriendResponse configurationFriendResponse = this.friend;
        return "ConfigurationResponse(friend=" + configurationFriendResponse + ")";
    }

    public ConfigurationResponse(ConfigurationFriendResponse friend) {
        Intrinsics.checkNotNullParameter(friend, "friend");
        this.friend = friend;
    }

    public final ConfigurationFriendResponse getFriend() {
        return this.friend;
    }
}
