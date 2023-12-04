package com.google.android.gms.common.server.response;

import com.google.android.gms.common.server.response.FastParser;
import java.io.BufferedReader;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
final class zac implements zai<Float> {
    @Override // com.google.android.gms.common.server.response.zai
    public final /* synthetic */ Float zaa(FastParser fastParser, BufferedReader bufferedReader) throws FastParser.ParseException, IOException {
        float zak;
        zak = fastParser.zak(bufferedReader);
        return Float.valueOf(zak);
    }
}
