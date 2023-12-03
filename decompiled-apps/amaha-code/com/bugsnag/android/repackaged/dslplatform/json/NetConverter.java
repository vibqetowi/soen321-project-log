package com.bugsnag.android.repackaged.dslplatform.json;

import com.bugsnag.android.repackaged.dslplatform.json.JsonReader;
import com.bugsnag.android.repackaged.dslplatform.json.JsonWriter;
import java.net.InetAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
/* loaded from: classes.dex */
public abstract class NetConverter {
    static final JsonReader.ReadObject<URI> UriReader = new JsonReader.ReadObject<URI>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NetConverter.1
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.ReadObject
        public URI read(JsonReader jsonReader) {
            if (jsonReader.wasNull()) {
                return null;
            }
            return NetConverter.deserializeUri(jsonReader);
        }
    };
    static final JsonWriter.WriteObject<URI> UriWriter = new JsonWriter.WriteObject<URI>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NetConverter.2
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonWriter.WriteObject
        public void write(JsonWriter jsonWriter, URI uri) {
            NetConverter.serializeNullable(uri, jsonWriter);
        }
    };
    static final JsonReader.ReadObject<InetAddress> AddressReader = new JsonReader.ReadObject<InetAddress>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NetConverter.3
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.ReadObject
        public InetAddress read(JsonReader jsonReader) {
            if (jsonReader.wasNull()) {
                return null;
            }
            return NetConverter.deserializeIp(jsonReader);
        }
    };
    static final JsonWriter.WriteObject<InetAddress> AddressWriter = new JsonWriter.WriteObject<InetAddress>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NetConverter.4
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonWriter.WriteObject
        public void write(JsonWriter jsonWriter, InetAddress inetAddress) {
            NetConverter.serializeNullable(inetAddress, jsonWriter);
        }
    };

    public static InetAddress deserializeIp(JsonReader jsonReader) {
        return InetAddress.getByName(jsonReader.readSimpleString());
    }

    public static ArrayList<InetAddress> deserializeIpCollection(JsonReader jsonReader) {
        return jsonReader.deserializeCollection(AddressReader);
    }

    public static ArrayList<InetAddress> deserializeIpNullableCollection(JsonReader jsonReader) {
        return jsonReader.deserializeNullableCollection(AddressReader);
    }

    public static URI deserializeUri(JsonReader jsonReader) {
        return URI.create(jsonReader.readString());
    }

    public static ArrayList<URI> deserializeUriCollection(JsonReader jsonReader) {
        return jsonReader.deserializeCollection(UriReader);
    }

    public static ArrayList<URI> deserializeUriNullableCollection(JsonReader jsonReader) {
        return jsonReader.deserializeNullableCollection(UriReader);
    }

    public static void serialize(URI uri, JsonWriter jsonWriter) {
        StringConverter.serializeShort(uri.toString(), jsonWriter);
    }

    public static void serializeNullable(URI uri, JsonWriter jsonWriter) {
        if (uri == null) {
            jsonWriter.writeNull();
        } else {
            serialize(uri, jsonWriter);
        }
    }

    public static void deserializeIpCollection(JsonReader jsonReader, Collection<InetAddress> collection) {
        jsonReader.deserializeCollection(AddressReader, collection);
    }

    public static void deserializeIpNullableCollection(JsonReader jsonReader, Collection<InetAddress> collection) {
        jsonReader.deserializeNullableCollection(AddressReader, collection);
    }

    public static void deserializeUriCollection(JsonReader jsonReader, Collection<URI> collection) {
        jsonReader.deserializeCollection(UriReader, collection);
    }

    public static void deserializeUriNullableCollection(JsonReader jsonReader, Collection<URI> collection) {
        jsonReader.deserializeNullableCollection(UriReader, collection);
    }

    public static void serialize(InetAddress inetAddress, JsonWriter jsonWriter) {
        jsonWriter.writeByte(JsonWriter.QUOTE);
        jsonWriter.writeAscii(inetAddress.getHostAddress());
        jsonWriter.writeByte(JsonWriter.QUOTE);
    }

    public static void serializeNullable(InetAddress inetAddress, JsonWriter jsonWriter) {
        if (inetAddress == null) {
            jsonWriter.writeNull();
        } else {
            serialize(inetAddress, jsonWriter);
        }
    }
}
