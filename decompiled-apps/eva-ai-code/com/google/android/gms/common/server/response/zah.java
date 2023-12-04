package com.google.android.gms.common.server.response;

import com.google.android.gms.common.server.response.FastParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigDecimal;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
final class zah implements zai<BigDecimal> {
    @Override // com.google.android.gms.common.server.response.zai
    public final /* synthetic */ BigDecimal zaa(FastParser fastParser, BufferedReader bufferedReader) throws FastParser.ParseException, IOException {
        BigDecimal zas;
        zas = fastParser.zas(bufferedReader);
        return zas;
    }
}
