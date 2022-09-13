/*
 * DolphinSchedulerApiDocsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package m6712345.m30.m168.m172.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.util.Map;

/**
 * This is a model class for BaseDataSourceParamDTO type.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        defaultImpl = BaseDataSourceParamDTO.class,
        visible = true)
@JsonSubTypes({
    @Type(value = ClickHouseDataSourceParamDTO.class, name = "ClickHouseDataSourceParamDTO"),
    @Type(value = Db2DataSourceParamDTO.class, name = "Db2DataSourceParamDTO"),
    @Type(value = HiveDataSourceParamDTO.class, name = "HiveDataSourceParamDTO"),
    @Type(value = MySQLDataSourceParamDTO.class, name = "MySQLDataSourceParamDTO"),
    @Type(value = OracleDataSourceParamDTO.class, name = "OracleDataSourceParamDTO"),
    @Type(value = PostgreSQLDataSourceParamDTO.class, name = "PostgreSQLDataSourceParamDTO"),
    @Type(value = PrestoDataSourceParamDTO.class, name = "PrestoDataSourceParamDTO"),
    @Type(value = RedshiftDataSourceParamDTO.class, name = "RedshiftDataSourceParamDTO"),
    @Type(value = SQLServerDataSourceParamDTO.class, name = "SQLServerDataSourceParamDTO"),
    @Type(value = SparkDataSourceParamDTO.class, name = "SparkDataSourceParamDTO")
})
@JsonInclude(Include.ALWAYS)
public class BaseDataSourceParamDTO {
    private String database;
    private String host;
    private Integer id;
    private String name;
    private String note;
    private Map<String, String> other;
    private String password;
    private Integer port;
    private String type;
    private String userName;

    /**
     * Default constructor.
     */
    public BaseDataSourceParamDTO() {
        setType("BaseDataSourceParamDTO");
    }

    /**
     * Initialization constructor.
     * @param  database  String value for database.
     * @param  host  String value for host.
     * @param  id  Integer value for id.
     * @param  name  String value for name.
     * @param  note  String value for note.
     * @param  other  Map of String, value for other.
     * @param  password  String value for password.
     * @param  port  Integer value for port.
     * @param  type  String value for type.
     * @param  userName  String value for userName.
     */
    public BaseDataSourceParamDTO(
            String database,
            String host,
            Integer id,
            String name,
            String note,
            Map<String, String> other,
            String password,
            Integer port,
            String type,
            String userName) {
        this.database = database;
        this.host = host;
        this.id = id;
        this.name = name;
        this.note = note;
        this.other = other;
        this.password = password;
        this.port = port;
        this.type = type;
        this.userName = userName;
    }

    /**
     * Getter for Database.
     * @return Returns the String
     */
    @JsonGetter("database")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDatabase() {
        return database;
    }

    /**
     * Setter for Database.
     * @param database Value for String
     */
    @JsonSetter("database")
    public void setDatabase(String database) {
        this.database = database;
    }

    /**
     * Getter for Host.
     * @return Returns the String
     */
    @JsonGetter("host")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getHost() {
        return host;
    }

    /**
     * Setter for Host.
     * @param host Value for String
     */
    @JsonSetter("host")
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * Getter for Id.
     * @return Returns the Integer
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for Integer
     */
    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for Name.
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Note.
     * @return Returns the String
     */
    @JsonGetter("note")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNote() {
        return note;
    }

    /**
     * Setter for Note.
     * @param note Value for String
     */
    @JsonSetter("note")
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * Getter for Other.
     * @return Returns the Map of String, String
     */
    @JsonGetter("other")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Map<String, String> getOther() {
        return other;
    }

    /**
     * Setter for Other.
     * @param other Value for Map of String, String
     */
    @JsonSetter("other")
    public void setOther(Map<String, String> other) {
        this.other = other;
    }

    /**
     * Getter for Password.
     * @return Returns the String
     */
    @JsonGetter("password")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPassword() {
        return password;
    }

    /**
     * Setter for Password.
     * @param password Value for String
     */
    @JsonSetter("password")
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Getter for Port.
     * @return Returns the Integer
     */
    @JsonGetter("port")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPort() {
        return port;
    }

    /**
     * Setter for Port.
     * @param port Value for Integer
     */
    @JsonSetter("port")
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * Getter for Type.
     * @return Returns the String
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getType() {
        return type;
    }

    /**
     * Setter for Type.
     * @param type Value for String
     */
    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Getter for UserName.
     * @return Returns the String
     */
    @JsonGetter("userName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUserName() {
        return userName;
    }

    /**
     * Setter for UserName.
     * @param userName Value for String
     */
    @JsonSetter("userName")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Converts this BaseDataSourceParamDTO into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BaseDataSourceParamDTO [" + "database=" + database + ", host=" + host + ", id=" + id
                + ", name=" + name + ", note=" + note + ", other=" + other + ", password="
                + password + ", port=" + port + ", type=" + type + ", userName=" + userName + "]";
    }

    /**
     * Builds a new {@link BaseDataSourceParamDTO.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BaseDataSourceParamDTO.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .database(getDatabase())
                .host(getHost())
                .id(getId())
                .name(getName())
                .note(getNote())
                .other(getOther())
                .password(getPassword())
                .port(getPort())
                .type(getType())
                .userName(getUserName());
        return builder;
    }

    /**
     * Class to build instances of {@link BaseDataSourceParamDTO}.
     */
    public static class Builder {
        private String database;
        private String host;
        private Integer id;
        private String name;
        private String note;
        private Map<String, String> other;
        private String password;
        private Integer port;
        private String type = "BaseDataSourceParamDTO";
        private String userName;



        /**
         * Setter for database.
         * @param  database  String value for database.
         * @return Builder
         */
        public Builder database(String database) {
            this.database = database;
            return this;
        }

        /**
         * Setter for host.
         * @param  host  String value for host.
         * @return Builder
         */
        public Builder host(String host) {
            this.host = host;
            return this;
        }

        /**
         * Setter for id.
         * @param  id  Integer value for id.
         * @return Builder
         */
        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for note.
         * @param  note  String value for note.
         * @return Builder
         */
        public Builder note(String note) {
            this.note = note;
            return this;
        }

        /**
         * Setter for other.
         * @param  other  Map of String, value for other.
         * @return Builder
         */
        public Builder other(Map<String, String> other) {
            this.other = other;
            return this;
        }

        /**
         * Setter for password.
         * @param  password  String value for password.
         * @return Builder
         */
        public Builder password(String password) {
            this.password = password;
            return this;
        }

        /**
         * Setter for port.
         * @param  port  Integer value for port.
         * @return Builder
         */
        public Builder port(Integer port) {
            this.port = port;
            return this;
        }

        /**
         * Setter for type.
         * @param  type  String value for type.
         * @return Builder
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for userName.
         * @param  userName  String value for userName.
         * @return Builder
         */
        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        /**
         * Builds a new {@link BaseDataSourceParamDTO} object using the set fields.
         * @return {@link BaseDataSourceParamDTO}
         */
        public BaseDataSourceParamDTO build() {
            return new BaseDataSourceParamDTO(database, host, id, name, note, other, password, port,
                    type, userName);
        }
    }
}
