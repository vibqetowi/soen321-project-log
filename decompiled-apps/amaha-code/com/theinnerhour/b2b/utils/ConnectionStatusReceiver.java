package com.theinnerhour.b2b.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.theinnerhour.b2b.MyApplication;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes2.dex */
public class ConnectionStatusReceiver extends BroadcastReceiver {
    private ArrayList<ConnectivityListener> connectivityListeners = new ArrayList<>();
    boolean isNetworkConnected = false;

    /* loaded from: classes2.dex */
    public interface ConnectivityListener {
        void networkConnected();

        void networkDisconnected();
    }

    private boolean checkStateChange(NetworkInfo networkInfo) {
        boolean z10;
        if (networkInfo != null && networkInfo.isConnected()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.isNetworkConnected = z10;
        return z10;
    }

    public static NetworkInfo getNetworkInfo(Context context) {
        return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
    }

    public static boolean isConnected() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) MyApplication.V.a().getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    public static boolean isConnectedFast(Context context) {
        NetworkInfo networkInfo = getNetworkInfo(context);
        if (networkInfo != null && networkInfo.isConnected() && isConnectionFast(networkInfo.getType(), networkInfo.getSubtype())) {
            return true;
        }
        return false;
    }

    public static boolean isConnectedMobile(Context context) {
        NetworkInfo networkInfo = getNetworkInfo(context);
        if (networkInfo != null && networkInfo.isConnected() && networkInfo.getType() == 0) {
            return true;
        }
        return false;
    }

    public static boolean isConnectedWifi(Context context) {
        NetworkInfo networkInfo = getNetworkInfo(context);
        if (networkInfo != null && networkInfo.isConnected() && networkInfo.getType() == 1) {
            return true;
        }
        return false;
    }

    public static boolean isConnectionFast(int i6, int i10) {
        if (i6 == 1) {
            return true;
        }
        if (i6 == 0) {
            switch (i10) {
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 13:
                case 14:
                case 15:
                    return true;
                case 4:
                case 7:
                case 11:
                default:
                    return false;
            }
        }
        return false;
    }

    public void addConnectivityListener(ConnectivityListener connectivityListener) {
        try {
            this.connectivityListeners.add(connectivityListener);
            if (connectivityListener != null) {
                if (isConnected()) {
                    connectivityListener.networkConnected();
                } else {
                    connectivityListener.networkDisconnected();
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e("connectionstatus", "exception in add connectivity listener", e10);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent != null && intent.getExtras() != null) {
            if (checkStateChange(((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo())) {
                Iterator<ConnectivityListener> it = this.connectivityListeners.iterator();
                while (it.hasNext()) {
                    it.next().networkConnected();
                }
                return;
            }
            Iterator<ConnectivityListener> it2 = this.connectivityListeners.iterator();
            while (it2.hasNext()) {
                it2.next().networkDisconnected();
            }
        }
    }

    public int removeConnectivityListener(ConnectivityListener connectivityListener) {
        Iterator<ConnectivityListener> it = this.connectivityListeners.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (connectivityListener == it.next()) {
                it.remove();
                break;
            }
        }
        return this.connectivityListeners.size();
    }
}
