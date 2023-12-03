package js;

import is.w;
import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.i;
/* compiled from: ListBuilder.kt */
/* loaded from: classes2.dex */
public final class e implements Externalizable {

    /* renamed from: u  reason: collision with root package name */
    public Collection<?> f22619u;

    /* renamed from: v  reason: collision with root package name */
    public final int f22620v;

    public e(int i6, Collection collection) {
        i.g(collection, "collection");
        this.f22619u = collection;
        this.f22620v = i6;
    }

    private final Object readResolve() {
        return this.f22619u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput input) {
        a aVar;
        i.g(input, "input");
        byte readByte = input.readByte();
        int i6 = readByte & 1;
        if ((readByte & (-2)) == 0) {
            int readInt = input.readInt();
            if (readInt >= 0) {
                int i10 = 0;
                if (i6 != 0) {
                    if (i6 == 1) {
                        g gVar = new g(new b(readInt));
                        while (i10 < readInt) {
                            gVar.add(input.readObject());
                            i10++;
                        }
                        ca.a.q(gVar);
                        aVar = gVar;
                    } else {
                        throw new InvalidObjectException("Unsupported collection type tag: " + i6 + '.');
                    }
                } else {
                    a aVar2 = new a(readInt);
                    while (i10 < readInt) {
                        aVar2.add(input.readObject());
                        i10++;
                    }
                    ca.a.o(aVar2);
                    aVar = aVar2;
                }
                this.f22619u = aVar;
                return;
            }
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        throw new InvalidObjectException("Unsupported flags value: " + ((int) readByte) + '.');
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput output) {
        i.g(output, "output");
        output.writeByte(this.f22620v);
        output.writeInt(this.f22619u.size());
        Iterator<?> it = this.f22619u.iterator();
        while (it.hasNext()) {
            output.writeObject(it.next());
        }
    }

    public e() {
        this(0, w.f20676u);
    }
}
