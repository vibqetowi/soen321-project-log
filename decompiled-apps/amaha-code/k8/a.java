package k8;

import androidx.work.k;
import g8.d;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: IcyDecoder.java */
/* loaded from: classes.dex */
public final class a extends k {

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f23065d = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: b  reason: collision with root package name */
    public final CharsetDecoder f23066b = nc.c.f25988c.newDecoder();

    /* renamed from: c  reason: collision with root package name */
    public final CharsetDecoder f23067c = nc.c.f25987b.newDecoder();

    @Override // androidx.work.k
    public final g8.a k(d dVar, ByteBuffer byteBuffer) {
        String str;
        CharsetDecoder charsetDecoder = this.f23067c;
        CharsetDecoder charsetDecoder2 = this.f23066b;
        String str2 = null;
        try {
            str = charsetDecoder2.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = charBuffer;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = null;
            } catch (Throwable th2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th2;
            }
        } finally {
            charsetDecoder2.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (str == null) {
            return new g8.a(new c(null, null, bArr));
        }
        Matcher matcher = f23065d.matcher(str);
        String str3 = null;
        for (int i6 = 0; matcher.find(i6); i6 = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String h02 = sc.b.h0(group);
                h02.getClass();
                if (!h02.equals("streamurl")) {
                    if (h02.equals("streamtitle")) {
                        str2 = group2;
                    }
                } else {
                    str3 = group2;
                }
            }
        }
        return new g8.a(new c(str2, str3, bArr));
    }
}
