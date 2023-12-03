package js;

import is.x;
import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import kotlin.jvm.internal.i;
/* compiled from: MapBuilder.kt */
/* loaded from: classes2.dex */
public final class f implements Externalizable {

    /* renamed from: u  reason: collision with root package name */
    public Map<?, ?> f22621u;

    public f(Map<?, ?> map) {
        i.g(map, "map");
        this.f22621u = map;
    }

    private final Object readResolve() {
        return this.f22621u;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput input) {
        i.g(input, "input");
        byte readByte = input.readByte();
        if (readByte == 0) {
            int readInt = input.readInt();
            if (readInt >= 0) {
                b bVar = new b(readInt);
                for (int i6 = 0; i6 < readInt; i6++) {
                    bVar.put(input.readObject(), input.readObject());
                }
                bVar.b();
                bVar.F = true;
                this.f22621u = bVar;
                return;
            }
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        throw new InvalidObjectException(defpackage.c.p("Unsupported flags value: ", readByte));
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput output) {
        i.g(output, "output");
        output.writeByte(0);
        output.writeInt(this.f22621u.size());
        for (Map.Entry<?, ?> entry : this.f22621u.entrySet()) {
            output.writeObject(entry.getKey());
            output.writeObject(entry.getValue());
        }
    }

    public f() {
        this(x.f20677u);
    }
}
