package io.sentry;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
/* loaded from: classes4.dex */
public final class EnvelopeReader implements IEnvelopeReader {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final Gson gson = new GsonBuilder().registerTypeAdapter(SentryEnvelopeHeader.class, new SentryEnvelopeHeaderAdapter()).registerTypeAdapter(SentryEnvelopeItemHeader.class, new SentryEnvelopeItemHeaderAdapter()).disableHtmlEscaping().create();

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0081, code lost:
        r11 = new io.sentry.SentryEnvelope(r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0086, code lost:
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0089, code lost:
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e2, code lost:
        throw new java.lang.IllegalArgumentException("Item header at index '" + r2.size() + "' is null or empty.");
     */
    @Override // io.sentry.IEnvelopeReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SentryEnvelope read(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        int i2 = -1;
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                int i3 = 0;
                while (true) {
                    if (i2 == -1 && i3 < read) {
                        if (bArr[i3] == 10) {
                            i2 = i + i3;
                            break;
                        }
                        i3++;
                    }
                }
                byteArrayOutputStream.write(bArr, 0, read);
                i += read;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (byteArray.length == 0) {
            throw new IllegalArgumentException("Empty stream.");
        }
        if (i2 == -1) {
            throw new IllegalArgumentException("Envelope contains no header.");
        }
        SentryEnvelopeHeader deserializeEnvelopeHeader = deserializeEnvelopeHeader(byteArray, 0, i2);
        if (deserializeEnvelopeHeader == null) {
            throw new IllegalArgumentException("Envelope header is null.");
        }
        int i4 = i2 + 1;
        ArrayList arrayList = new ArrayList();
        while (true) {
            int i5 = i4;
            while (true) {
                if (i5 >= byteArray.length) {
                    i5 = -1;
                    break;
                } else if (byteArray[i5] == 10) {
                    break;
                } else {
                    i5++;
                }
            }
            if (i5 == -1) {
                throw new IllegalArgumentException("Invalid envelope. Item at index '" + arrayList.size() + "'. has no header delimiter.");
            }
            SentryEnvelopeItemHeader deserializeEnvelopeItemHeader = deserializeEnvelopeItemHeader(byteArray, i4, i5 - i4);
            if (deserializeEnvelopeItemHeader == null || deserializeEnvelopeItemHeader.getLength() <= 0) {
                break;
            }
            int length = deserializeEnvelopeItemHeader.getLength() + i5 + 1;
            if (length > byteArray.length) {
                throw new IllegalArgumentException("Invalid length for item at index '" + arrayList.size() + "'. Item is '" + length + "' bytes. There are '" + byteArray.length + "' in the buffer.");
            }
            arrayList.add(new SentryEnvelopeItem(deserializeEnvelopeItemHeader, Arrays.copyOfRange(byteArray, i5 + 1, length)));
            if (length == byteArray.length) {
                break;
            }
            i4 = length + 1;
            if (i4 == byteArray.length) {
                if (byteArray[length] != 10) {
                    throw new IllegalArgumentException("Envelope has invalid data following an item.");
                }
            }
        }
    }

    private SentryEnvelopeHeader deserializeEnvelopeHeader(byte[] bArr, int i, int i2) {
        return (SentryEnvelopeHeader) this.gson.fromJson(new String(bArr, i, i2, UTF_8), (Class<Object>) SentryEnvelopeHeader.class);
    }

    private SentryEnvelopeItemHeader deserializeEnvelopeItemHeader(byte[] bArr, int i, int i2) {
        return (SentryEnvelopeItemHeader) this.gson.fromJson(new String(bArr, i, i2, UTF_8), (Class<Object>) SentryEnvelopeItemHeader.class);
    }
}
