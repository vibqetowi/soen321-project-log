package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzjy implements ServiceConnection, BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzjz zza;
    private volatile boolean zzb;
    private volatile zzep zzc;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzjy(zzjz zzjzVar) {
        this.zza = zzjzVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                Preconditions.checkNotNull(this.zzc);
                this.zza.zzt.zzaB().zzp(new zzjv(this, (zzej) this.zzc.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.zzc = null;
                this.zzb = false;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionFailed");
        zzet zzl = this.zza.zzt.zzl();
        if (zzl != null) {
            zzl.zzk().zzb("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.zzb = false;
            this.zzc = null;
        }
        this.zza.zzt.zzaB().zzp(new zzjx(this));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionSuspended");
        this.zza.zzt.zzaA().zzc().zza("Service connection suspended");
        this.zza.zzt.zzaB().zzp(new zzjw(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzjy zzjyVar;
        zzej zzehVar;
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder != null) {
                zzej zzejVar = null;
                try {
                    String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                    if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                        if (queryLocalInterface instanceof zzej) {
                            zzehVar = (zzej) queryLocalInterface;
                        } else {
                            zzehVar = new zzeh(iBinder);
                        }
                        zzejVar = zzehVar;
                        this.zza.zzt.zzaA().zzj().zza("Bound to IMeasurementService interface");
                    } else {
                        this.zza.zzt.zzaA().zzd().zzb("Got binder with a wrong descriptor", interfaceDescriptor);
                    }
                } catch (RemoteException unused) {
                    this.zza.zzt.zzaA().zzd().zza("Service connect failed to get IMeasurementService");
                }
                if (zzejVar == null) {
                    this.zzb = false;
                    try {
                        ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
                        Context zzaw = this.zza.zzt.zzaw();
                        zzjyVar = this.zza.zza;
                        connectionTracker.unbindService(zzaw, zzjyVar);
                    } catch (IllegalArgumentException unused2) {
                    }
                } else {
                    this.zza.zzt.zzaB().zzp(new zzjt(this, zzejVar));
                }
                return;
            }
            this.zzb = false;
            this.zza.zzt.zzaA().zzd().zza("Service connected with null binder");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceDisconnected");
        this.zza.zzt.zzaA().zzc().zza("Service disconnected");
        this.zza.zzt.zzaB().zzp(new zzju(this, componentName));
    }

    public final void zzb(Intent intent) {
        zzjy zzjyVar;
        this.zza.zzg();
        Context zzaw = this.zza.zzt.zzaw();
        ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
        synchronized (this) {
            if (this.zzb) {
                this.zza.zzt.zzaA().zzj().zza("Connection attempt already in progress");
                return;
            }
            this.zza.zzt.zzaA().zzj().zza("Using local app measurement service");
            this.zzb = true;
            zzjyVar = this.zza.zza;
            connectionTracker.bindService(zzaw, intent, zzjyVar, TsExtractor.TS_STREAM_TYPE_AC3);
        }
    }

    public final void zzc() {
        this.zza.zzg();
        Context zzaw = this.zza.zzt.zzaw();
        synchronized (this) {
            if (this.zzb) {
                this.zza.zzt.zzaA().zzj().zza("Connection attempt already in progress");
            } else if (this.zzc == null || (!this.zzc.isConnecting() && !this.zzc.isConnected())) {
                this.zzc = new zzep(zzaw, Looper.getMainLooper(), this, this);
                this.zza.zzt.zzaA().zzj().zza("Connecting to remote service");
                this.zzb = true;
                Preconditions.checkNotNull(this.zzc);
                this.zzc.checkAvailabilityAndConnect();
            } else {
                this.zza.zzt.zzaA().zzj().zza("Already awaiting connection attempt");
            }
        }
    }

    public final void zzd() {
        if (this.zzc != null && (this.zzc.isConnected() || this.zzc.isConnecting())) {
            this.zzc.disconnect();
        }
        this.zzc = null;
    }
}
