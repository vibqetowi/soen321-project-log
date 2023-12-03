package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import b9.c;
import b9.h;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
/* loaded from: classes.dex */
public final class UdpDataSource extends c {

    /* renamed from: e  reason: collision with root package name */
    public final int f7179e;
    public final byte[] f;

    /* renamed from: g  reason: collision with root package name */
    public final DatagramPacket f7180g;

    /* renamed from: h  reason: collision with root package name */
    public Uri f7181h;

    /* renamed from: i  reason: collision with root package name */
    public DatagramSocket f7182i;

    /* renamed from: j  reason: collision with root package name */
    public MulticastSocket f7183j;

    /* renamed from: k  reason: collision with root package name */
    public InetAddress f7184k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f7185l;

    /* renamed from: m  reason: collision with root package name */
    public int f7186m;

    /* loaded from: classes.dex */
    public static final class UdpDataSourceException extends DataSourceException {
        public UdpDataSourceException(Exception exc, int i6) {
            super(exc, i6);
        }
    }

    public UdpDataSource() {
        super(true);
        this.f7179e = 8000;
        byte[] bArr = new byte[2000];
        this.f = bArr;
        this.f7180g = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // b9.f
    public final void close() {
        this.f7181h = null;
        MulticastSocket multicastSocket = this.f7183j;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f7184k;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f7183j = null;
        }
        DatagramSocket datagramSocket = this.f7182i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f7182i = null;
        }
        this.f7184k = null;
        this.f7186m = 0;
        if (this.f7185l) {
            this.f7185l = false;
            o();
        }
    }

    @Override // b9.f
    public final Uri getUri() {
        return this.f7181h;
    }

    @Override // b9.f
    public final long h(h hVar) {
        Uri uri = hVar.f4128a;
        this.f7181h = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f7181h.getPort();
        p(hVar);
        try {
            this.f7184k = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f7184k, port);
            if (this.f7184k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f7183j = multicastSocket;
                multicastSocket.joinGroup(this.f7184k);
                this.f7182i = this.f7183j;
            } else {
                this.f7182i = new DatagramSocket(inetSocketAddress);
            }
            this.f7182i.setSoTimeout(this.f7179e);
            this.f7185l = true;
            q(hVar);
            return -1L;
        } catch (IOException e10) {
            throw new UdpDataSourceException(e10, 2001);
        } catch (SecurityException e11) {
            throw new UdpDataSourceException(e11, 2006);
        }
    }

    @Override // b9.d
    public final int read(byte[] bArr, int i6, int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = this.f7186m;
        DatagramPacket datagramPacket = this.f7180g;
        if (i11 == 0) {
            try {
                DatagramSocket datagramSocket = this.f7182i;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f7186m = length;
                n(length);
            } catch (SocketTimeoutException e10) {
                throw new UdpDataSourceException(e10, 2002);
            } catch (IOException e11) {
                throw new UdpDataSourceException(e11, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i12 = this.f7186m;
        int min = Math.min(i12, i10);
        System.arraycopy(this.f, length2 - i12, bArr, i6, min);
        this.f7186m -= min;
        return min;
    }
}
