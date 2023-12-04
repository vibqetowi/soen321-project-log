package io.grpc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: classes4.dex */
public final class ChoiceServerCredentials extends ServerCredentials {
    private final List<ServerCredentials> creds;

    public static ServerCredentials create(ServerCredentials... serverCredentialsArr) {
        if (serverCredentialsArr.length == 0) {
            throw new IllegalArgumentException("At least one credential is required");
        }
        return new ChoiceServerCredentials(serverCredentialsArr);
    }

    private ChoiceServerCredentials(ServerCredentials... serverCredentialsArr) {
        for (ServerCredentials serverCredentials : serverCredentialsArr) {
            serverCredentials.getClass();
        }
        this.creds = Collections.unmodifiableList(new ArrayList(Arrays.asList(serverCredentialsArr)));
    }

    public List<ServerCredentials> getCredentialsList() {
        return this.creds;
    }
}
