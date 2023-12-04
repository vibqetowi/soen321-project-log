package io.grpc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: classes4.dex */
public final class ChoiceChannelCredentials extends ChannelCredentials {
    private final List<ChannelCredentials> creds;

    public static ChannelCredentials create(ChannelCredentials... channelCredentialsArr) {
        if (channelCredentialsArr.length == 0) {
            throw new IllegalArgumentException("At least one credential is required");
        }
        for (ChannelCredentials channelCredentials : channelCredentialsArr) {
            channelCredentials.getClass();
        }
        return new ChoiceChannelCredentials(Collections.unmodifiableList(new ArrayList(Arrays.asList(channelCredentialsArr))));
    }

    private ChoiceChannelCredentials(List<ChannelCredentials> list) {
        this.creds = list;
    }

    public List<ChannelCredentials> getCredentialsList() {
        return this.creds;
    }

    @Override // io.grpc.ChannelCredentials
    public ChannelCredentials withoutBearerTokens() {
        ArrayList arrayList = new ArrayList();
        for (ChannelCredentials channelCredentials : this.creds) {
            arrayList.add(channelCredentials.withoutBearerTokens());
        }
        return new ChoiceChannelCredentials(Collections.unmodifiableList(arrayList));
    }
}
