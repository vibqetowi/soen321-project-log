package ds;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
/* compiled from: Phonemetadata.java */
/* loaded from: classes2.dex */
public final class e implements Externalizable {
    public boolean A;
    public boolean C;
    public boolean E;
    public boolean G;
    public boolean I;
    public boolean K;
    public boolean M;
    public boolean O;
    public boolean Q;
    public boolean S;
    public boolean U;
    public boolean W;
    public boolean Y;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f13311a0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f13314f0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f13316h0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f13318j0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f13320l0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f13322n0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f13328t0;

    /* renamed from: u  reason: collision with root package name */
    public boolean f13329u;

    /* renamed from: w  reason: collision with root package name */
    public boolean f13333w;

    /* renamed from: y  reason: collision with root package name */
    public boolean f13336y;

    /* renamed from: v  reason: collision with root package name */
    public f f13331v = null;

    /* renamed from: x  reason: collision with root package name */
    public f f13335x = null;

    /* renamed from: z  reason: collision with root package name */
    public f f13337z = null;
    public f B = null;
    public f D = null;
    public f F = null;
    public f H = null;
    public f J = null;
    public f L = null;
    public f N = null;
    public f P = null;
    public f R = null;
    public f T = null;
    public f V = null;
    public f X = null;
    public f Z = null;

    /* renamed from: b0  reason: collision with root package name */
    public f f13312b0 = null;
    public String c0 = "";

    /* renamed from: d0  reason: collision with root package name */
    public int f13313d0 = 0;
    public String e0 = "";

    /* renamed from: g0  reason: collision with root package name */
    public String f13315g0 = "";

    /* renamed from: i0  reason: collision with root package name */
    public String f13317i0 = "";

    /* renamed from: k0  reason: collision with root package name */
    public String f13319k0 = "";

    /* renamed from: m0  reason: collision with root package name */
    public String f13321m0 = "";

    /* renamed from: o0  reason: collision with root package name */
    public String f13323o0 = "";

    /* renamed from: p0  reason: collision with root package name */
    public boolean f13324p0 = false;

    /* renamed from: q0  reason: collision with root package name */
    public final ArrayList f13325q0 = new ArrayList();

    /* renamed from: r0  reason: collision with root package name */
    public final ArrayList f13326r0 = new ArrayList();

    /* renamed from: s0  reason: collision with root package name */
    public boolean f13327s0 = false;

    /* renamed from: u0  reason: collision with root package name */
    public String f13330u0 = "";

    /* renamed from: v0  reason: collision with root package name */
    public boolean f13332v0 = false;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f13334w0 = false;

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        if (objectInput.readBoolean()) {
            f fVar = new f();
            fVar.readExternal(objectInput);
            this.f13329u = true;
            this.f13331v = fVar;
        }
        if (objectInput.readBoolean()) {
            f fVar2 = new f();
            fVar2.readExternal(objectInput);
            this.f13333w = true;
            this.f13335x = fVar2;
        }
        if (objectInput.readBoolean()) {
            f fVar3 = new f();
            fVar3.readExternal(objectInput);
            this.f13336y = true;
            this.f13337z = fVar3;
        }
        if (objectInput.readBoolean()) {
            f fVar4 = new f();
            fVar4.readExternal(objectInput);
            this.A = true;
            this.B = fVar4;
        }
        if (objectInput.readBoolean()) {
            f fVar5 = new f();
            fVar5.readExternal(objectInput);
            this.C = true;
            this.D = fVar5;
        }
        if (objectInput.readBoolean()) {
            f fVar6 = new f();
            fVar6.readExternal(objectInput);
            this.E = true;
            this.F = fVar6;
        }
        if (objectInput.readBoolean()) {
            f fVar7 = new f();
            fVar7.readExternal(objectInput);
            this.G = true;
            this.H = fVar7;
        }
        if (objectInput.readBoolean()) {
            f fVar8 = new f();
            fVar8.readExternal(objectInput);
            this.I = true;
            this.J = fVar8;
        }
        if (objectInput.readBoolean()) {
            f fVar9 = new f();
            fVar9.readExternal(objectInput);
            this.K = true;
            this.L = fVar9;
        }
        if (objectInput.readBoolean()) {
            f fVar10 = new f();
            fVar10.readExternal(objectInput);
            this.M = true;
            this.N = fVar10;
        }
        if (objectInput.readBoolean()) {
            f fVar11 = new f();
            fVar11.readExternal(objectInput);
            this.O = true;
            this.P = fVar11;
        }
        if (objectInput.readBoolean()) {
            f fVar12 = new f();
            fVar12.readExternal(objectInput);
            this.Q = true;
            this.R = fVar12;
        }
        if (objectInput.readBoolean()) {
            f fVar13 = new f();
            fVar13.readExternal(objectInput);
            this.S = true;
            this.T = fVar13;
        }
        if (objectInput.readBoolean()) {
            f fVar14 = new f();
            fVar14.readExternal(objectInput);
            this.U = true;
            this.V = fVar14;
        }
        if (objectInput.readBoolean()) {
            f fVar15 = new f();
            fVar15.readExternal(objectInput);
            this.W = true;
            this.X = fVar15;
        }
        if (objectInput.readBoolean()) {
            f fVar16 = new f();
            fVar16.readExternal(objectInput);
            this.Y = true;
            this.Z = fVar16;
        }
        if (objectInput.readBoolean()) {
            f fVar17 = new f();
            fVar17.readExternal(objectInput);
            this.f13311a0 = true;
            this.f13312b0 = fVar17;
        }
        this.c0 = objectInput.readUTF();
        this.f13313d0 = objectInput.readInt();
        this.e0 = objectInput.readUTF();
        if (objectInput.readBoolean()) {
            String readUTF = objectInput.readUTF();
            this.f13314f0 = true;
            this.f13315g0 = readUTF;
        }
        if (objectInput.readBoolean()) {
            String readUTF2 = objectInput.readUTF();
            this.f13316h0 = true;
            this.f13317i0 = readUTF2;
        }
        if (objectInput.readBoolean()) {
            String readUTF3 = objectInput.readUTF();
            this.f13318j0 = true;
            this.f13319k0 = readUTF3;
        }
        if (objectInput.readBoolean()) {
            String readUTF4 = objectInput.readUTF();
            this.f13320l0 = true;
            this.f13321m0 = readUTF4;
        }
        if (objectInput.readBoolean()) {
            String readUTF5 = objectInput.readUTF();
            this.f13322n0 = true;
            this.f13323o0 = readUTF5;
        }
        this.f13324p0 = objectInput.readBoolean();
        int readInt = objectInput.readInt();
        for (int i6 = 0; i6 < readInt; i6++) {
            d dVar = new d();
            dVar.readExternal(objectInput);
            this.f13325q0.add(dVar);
        }
        int readInt2 = objectInput.readInt();
        for (int i10 = 0; i10 < readInt2; i10++) {
            d dVar2 = new d();
            dVar2.readExternal(objectInput);
            this.f13326r0.add(dVar2);
        }
        this.f13327s0 = objectInput.readBoolean();
        if (objectInput.readBoolean()) {
            String readUTF6 = objectInput.readUTF();
            this.f13328t0 = true;
            this.f13330u0 = readUTF6;
        }
        this.f13332v0 = objectInput.readBoolean();
        this.f13334w0 = objectInput.readBoolean();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeBoolean(this.f13329u);
        if (this.f13329u) {
            this.f13331v.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f13333w);
        if (this.f13333w) {
            this.f13335x.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f13336y);
        if (this.f13336y) {
            this.f13337z.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.A);
        if (this.A) {
            this.B.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.C);
        if (this.C) {
            this.D.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.E);
        if (this.E) {
            this.F.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.G);
        if (this.G) {
            this.H.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.I);
        if (this.I) {
            this.J.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.K);
        if (this.K) {
            this.L.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.M);
        if (this.M) {
            this.N.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.O);
        if (this.O) {
            this.P.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.Q);
        if (this.Q) {
            this.R.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.S);
        if (this.S) {
            this.T.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.U);
        if (this.U) {
            this.V.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.W);
        if (this.W) {
            this.X.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.Y);
        if (this.Y) {
            this.Z.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f13311a0);
        if (this.f13311a0) {
            this.f13312b0.writeExternal(objectOutput);
        }
        objectOutput.writeUTF(this.c0);
        objectOutput.writeInt(this.f13313d0);
        objectOutput.writeUTF(this.e0);
        objectOutput.writeBoolean(this.f13314f0);
        if (this.f13314f0) {
            objectOutput.writeUTF(this.f13315g0);
        }
        objectOutput.writeBoolean(this.f13316h0);
        if (this.f13316h0) {
            objectOutput.writeUTF(this.f13317i0);
        }
        objectOutput.writeBoolean(this.f13318j0);
        if (this.f13318j0) {
            objectOutput.writeUTF(this.f13319k0);
        }
        objectOutput.writeBoolean(this.f13320l0);
        if (this.f13320l0) {
            objectOutput.writeUTF(this.f13321m0);
        }
        objectOutput.writeBoolean(this.f13322n0);
        if (this.f13322n0) {
            objectOutput.writeUTF(this.f13323o0);
        }
        objectOutput.writeBoolean(this.f13324p0);
        ArrayList arrayList = this.f13325q0;
        int size = arrayList.size();
        objectOutput.writeInt(size);
        for (int i6 = 0; i6 < size; i6++) {
            ((d) arrayList.get(i6)).writeExternal(objectOutput);
        }
        ArrayList arrayList2 = this.f13326r0;
        int size2 = arrayList2.size();
        objectOutput.writeInt(size2);
        for (int i10 = 0; i10 < size2; i10++) {
            ((d) arrayList2.get(i10)).writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f13327s0);
        objectOutput.writeBoolean(this.f13328t0);
        if (this.f13328t0) {
            objectOutput.writeUTF(this.f13330u0);
        }
        objectOutput.writeBoolean(this.f13332v0);
        objectOutput.writeBoolean(this.f13334w0);
    }
}
