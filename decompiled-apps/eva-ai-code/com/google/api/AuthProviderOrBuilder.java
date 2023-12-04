package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;
/* loaded from: classes7.dex */
public interface AuthProviderOrBuilder extends MessageOrBuilder {
    String getAudiences();

    ByteString getAudiencesBytes();

    String getAuthorizationUrl();

    ByteString getAuthorizationUrlBytes();

    String getId();

    ByteString getIdBytes();

    String getIssuer();

    ByteString getIssuerBytes();

    String getJwksUri();

    ByteString getJwksUriBytes();

    JwtLocation getJwtLocations(int i);

    int getJwtLocationsCount();

    List<JwtLocation> getJwtLocationsList();

    JwtLocationOrBuilder getJwtLocationsOrBuilder(int i);

    List<? extends JwtLocationOrBuilder> getJwtLocationsOrBuilderList();
}
