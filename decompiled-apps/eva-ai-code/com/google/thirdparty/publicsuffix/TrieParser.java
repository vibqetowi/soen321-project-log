package com.google.thirdparty.publicsuffix;

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Queues;
import java.util.Deque;
/* loaded from: classes6.dex */
final class TrieParser {
    private static final Joiner PREFIX_JOINER = Joiner.on("");

    TrieParser() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ImmutableMap<String, PublicSuffixType> parseTrie(CharSequence charSequence) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            i += doParseTrieToBuilder(Queues.newArrayDeque(), charSequence, i, builder);
        }
        return builder.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int doParseTrieToBuilder(Deque<CharSequence> deque, CharSequence charSequence, int i, ImmutableMap.Builder<String, PublicSuffixType> builder) {
        int length = charSequence.length();
        char c = 0;
        int i2 = i;
        while (i2 < length && (c = charSequence.charAt(i2)) != '&' && c != '?' && c != '!' && c != ':' && c != ',') {
            i2++;
        }
        deque.push(reverse(charSequence.subSequence(i, i2)));
        if (c == '!' || c == '?' || c == ':' || c == ',') {
            String join = PREFIX_JOINER.join(deque);
            if (join.length() > 0) {
                builder.put(join, PublicSuffixType.fromCode(c));
            }
        }
        int i3 = i2 + 1;
        if (c != '?' && c != ',') {
            while (i3 < length) {
                i3 += doParseTrieToBuilder(deque, charSequence, i3, builder);
                if (charSequence.charAt(i3) == '?' || charSequence.charAt(i3) == ',') {
                    i3++;
                    break;
                }
                while (i3 < length) {
                }
            }
        }
        deque.pop();
        return i3 - i;
    }

    private static CharSequence reverse(CharSequence charSequence) {
        return new StringBuilder(charSequence).reverse();
    }
}
