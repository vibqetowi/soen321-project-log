package com.ifriend.common_utils.encoder;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
/* compiled from: SextingEncoder.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0002J)\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r\"\u00020\u000eH\u0002¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ifriend/common_utils/encoder/SextingEncoder;", "Lcom/ifriend/common_utils/encoder/Encoder;", "", "()V", "encode", "input", "encodeSextingWord", "word", "hideLetterCount", "", "intByHash", "upperLimit", "data", "", "", "(I[Ljava/lang/Object;)I", "common_utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SextingEncoder implements Encoder<String, String> {
    public static final SextingEncoder INSTANCE = new SextingEncoder();

    private SextingEncoder() {
    }

    @Override // com.ifriend.common_utils.encoder.Encoder
    public String encode(String input) {
        int i;
        Intrinsics.checkNotNullParameter(input, "input");
        List split$default = StringsKt.split$default((CharSequence) input, new String[]{" "}, false, 0, 6, (Object) null);
        String str = "";
        int i2 = 0;
        for (Object obj : split$default) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str2 = (String) obj;
            int length = str2.length();
            SextingEncoder sextingEncoder = INSTANCE;
            if (length < 2) {
                i = 0;
            } else {
                i = 2 <= length && length < 5 ? length - 1 : length - 2;
            }
            str = ((Object) str) + sextingEncoder.encodeSextingWord(str2, i);
            if (i2 < split$default.size() - 1) {
                str = ((Object) str) + " ";
            }
            i2 = i3;
        }
        return str;
    }

    private final String encodeSextingWord(String str, int i) {
        List<Character> list = StringsKt.toList("╡╣║╜╒╞╟╬╫╨╪╥░▋▞▜");
        char[] charArray = str.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()");
        ArrayList arrayList = new ArrayList();
        int length = charArray.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            arrayList.add(new Pair(Character.valueOf(charArray[i2]), Integer.valueOf(i3)));
            i2++;
            i3++;
        }
        for (int i4 = 0; i4 < i; i4++) {
            int intByHash = intByHash(list.size(), str, Integer.valueOf(i4));
            int intByHash2 = intByHash(arrayList.size(), str, Integer.valueOf(i4));
            charArray[((Number) ((Pair) arrayList.get(intByHash2)).getSecond()).intValue()] = list.get(intByHash).charValue();
            arrayList.remove(intByHash2);
        }
        return new String(charArray);
    }

    private final int intByHash(int i, Object... objArr) {
        int i2 = 0;
        for (Object obj : objArr) {
            i2 += obj.hashCode();
        }
        return Math.abs(i2) % i;
    }
}
