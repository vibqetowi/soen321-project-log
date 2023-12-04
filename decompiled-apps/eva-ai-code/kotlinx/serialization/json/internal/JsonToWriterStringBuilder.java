package kotlinx.serialization.json.internal;

import io.sentry.protocol.OperatingSystem;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.Charsets;
/* compiled from: JsonToWriterStringBuilder.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\r\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0014J\u0012\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000bH\u0002J\b\u0010\u0011\u001a\u00020\u000fH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lkotlinx/serialization/json/internal/JsonToWriterStringBuilder;", "Lkotlinx/serialization/json/internal/JsonStringBuilder;", OperatingSystem.TYPE, "Ljava/io/OutputStream;", "charset", "Ljava/nio/charset/Charset;", "(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V", "writer", "Ljava/io/Writer;", "(Ljava/io/Writer;)V", "ensureTotalCapacity", "", "oldSize", "additional", "flush", "", "sz", "release", "kotlinx-serialization-json"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class JsonToWriterStringBuilder extends JsonStringBuilder {
    private final Writer writer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonToWriterStringBuilder(Writer writer) {
        super(new char[16384]);
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.writer = writer;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JsonToWriterStringBuilder(OutputStream os, Charset charset) {
        this(r0 instanceof BufferedWriter ? (BufferedWriter) r0 : new BufferedWriter(r0, 262144));
        Intrinsics.checkNotNullParameter(os, "os");
        Intrinsics.checkNotNullParameter(charset, "charset");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(os, charset);
    }

    public /* synthetic */ JsonToWriterStringBuilder(OutputStream outputStream, Charset charset, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(outputStream, (i & 2) != 0 ? Charsets.UTF_8 : charset);
    }

    @Override // kotlinx.serialization.json.internal.JsonStringBuilder
    protected int ensureTotalCapacity(int i, int i2) {
        int i3 = i + i2;
        int length = this.array.length;
        if (length <= i3) {
            flush(i);
            if (i2 > length) {
                this.array = new char[RangesKt.coerceAtLeast(i3, length * 2)];
            }
            return 0;
        }
        return i;
    }

    static /* synthetic */ void flush$default(JsonToWriterStringBuilder jsonToWriterStringBuilder, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = jsonToWriterStringBuilder.getSize();
        }
        jsonToWriterStringBuilder.flush(i);
    }

    private final void flush(int i) {
        this.writer.write(this.array, 0, i);
        setSize(0);
    }

    @Override // kotlinx.serialization.json.internal.JsonStringBuilder
    public void release() {
        flush$default(this, 0, 1, null);
        this.writer.flush();
    }
}
