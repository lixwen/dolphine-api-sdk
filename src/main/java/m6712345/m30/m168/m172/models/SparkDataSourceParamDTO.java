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
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.util.Map;

/**
 * This is a model class for SparkDataSourceParamDTO type.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        defaultImpl = SparkDataSourceParamDTO.class,
        visible = true)
@JsonInclude(Include.ALWAYS)
public class SparkDataSourceParamDTO
        extends BaseDataSourceParamDTO {
    private String database;
    private String host;
    private Integer id;
    private String javaSecurityKrb5Conf;
    private String loginUserKeytabPath;
    private String loginUserKeytabUsername;
    private String name;
    private String note;
    private Map<String, String> other;
    private String password;
    private Integer port;
    private String principal;
    private TypeEnum type;
    private String userName;

    /**
     * Default constructor.
     */
    public SparkDataSourceParamDTO() {
        super();
        setType("SparkDataSourceParamDTO");
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
     * @param  database  String value for database.
     * @param  host  String value for host.
     * @param  id  Integer value for id.
     * @param  javaSecurityKrb5Conf  String value for javaSecurityKrb5Conf.
     * @param  loginUserKeytabPath  String value for loginUserKeytabPath.
     * @param  loginUserKeytabUsername  String value for loginUserKeytabUsername.
     * @param  name  String value for name.
     * @param  note  String value for note.
     * @param  other  Map of String, value for other.
     * @param  password  String value for password.
     * @param  port  Integer value for port.
     * @param  principal  String value for principal.
     * @param  type  TypeEnum value for type.
     * @param  userName  String value for userName.
     */
    public SparkDataSourceParamDTO(
            String database,
            String host,
            Integer id,
            String name,
            String note,
            Map<String, String> other,
            String password,
            Integer port,
            String type,
            String userName,
            String database,
            String host,
            Integer id,
            String javaSecurityKrb5Conf,
            String loginUserKeytabPath,
            String loginUserKeytabUsername,
            String name,
            String note,
            Map<String, String> other,
            String password,
            Integer port,
            String principal,
            TypeEnum type,
            String userName) {
        super(database, host, id, name, note, other, password, port, type, userName);
        this.database = database;
        this.host = host;
        this.id = id;
        this.javaSecurityKrb5Conf = javaSecurityKrb5Conf;
        this.loginUserKeytabPath = loginUserKeytabPath;
        this.loginUserKeytabUsername = loginUserKeytabUsername;
        this.name = name;
        this.note = note;
        this.other = other;
        this.password = password;
        this.port = port;
        this.principal = principal;
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
     * Getter for JavaSecurityKrb5Conf.
     * @return Returns the String
     */
    @JsonGetter("javaSecurityKrb5Conf")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getJavaSecurityKrb5Conf() {
        return javaSecurityKrb5Conf;
    }

    /**
     * Setter for JavaSecurityKrb5Conf.
     * @param javaSecurityKrb5Conf Value for String
     */
    @JsonSetter("javaSecurityKrb5Conf")
    public void setJavaSecurityKrb5Conf(String javaSecurityKrb5Conf) {
        this.javaSecurityKrb5Conf = javaSecurityKrb5Conf;
    }

    /**
     * Getter for LoginUserKeytabPath.
     * @return Returns the String
     */
    @JsonGetter("loginUserKeytabPath")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLoginUserKeytabPath() {
        return loginUserKeytabPath;
    }

    /**
     * Setter for LoginUserKeytabPath.
     * @param loginUserKeytabPath Value for String
     */
    @JsonSetter("loginUserKeytabPath")
    public void setLoginUserKeytabPath(String loginUserKeytabPath) {
        this.loginUserKeytabPath = loginUserKeytabPath;
    }

    /**
     * Getter for LoginUserKeytabUsername.
     * @return Returns the String
     */
    @JsonGetter("loginUserKeytabUsername")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLoginUserKeytabUsername() {
        return loginUserKeytabUsername;
    }

    /**
     * Setter for LoginUserKeytabUsername.
     * @param loginUserKeytabUsername Value for String
     */
    @JsonSetter("loginUserKeytabUsername")
    public void setLoginUserKeytabUsername(String loginUserKeytabUsername) {
        this.loginUserKeytabUsername = loginUserKeytabUsername;
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
     * Getter for Principal.
     * @return Returns the String
     */
    @JsonGetter("principal")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPrincipal() {
        return principal;
    }

    /**
     * Setter for Principal.
     * @param principal Value for String
     */
    @JsonSetter("principal")
    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    /**
     * Getter for Type.
     * @return Returns the TypeEnum
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TypeEnum getType() {
        return type;
    }

    /**
     * Setter for Type.
     * @param type Value for TypeEnum
     */
    @JsonSetter("type")
    public void setType(TypeEnum type) {
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
     * Converts this SparkDataSourceParamDTO into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SparkDataSourceParamDTO [" + "database=" + database + ", host=" + host + ", id="
                + id + ", javaSecurityKrb5Conf=" + javaSecurityKrb5Conf + ", loginUserKeytabPath="
                + loginUserKeytabPath + ", loginUserKeytabUsername=" + loginUserKeytabUsername
                + ", name=" + name + ", note=" + note + ", other=" + other + ", password="
                + password + ", port=" + port + ", principal=" + principal + ", type=" + type
                + ", userName=" + userName + ", database=" + getDatabase() + ", host=" + getHost()
                + ", id=" + getId() + ", name=" + getName() + ", note=" + getNote() + ", other="
                + getOther() + ", password=" + getPassword() + ", port=" + getPort() + ", type="
                + getType() + ", userName=" + getUserName() + "]";
    }

    /**
     * Builds a new {@link SparkDataSourceParamDTO.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SparkDataSourceParamDTO.Builder} object
     */
    public Builder toSparkDataSourceParamDTOBuilder() {
        Builder builder = new Builder()
                .database(getDatabase())
                .host(getHost())
                .id(getId())
                .javaSecurityKrb5Conf(getJavaSecurityKrb5Conf())
                .loginUserKeytabPath(getLoginUserKeytabPath())
                .loginUserKeytabUsername(getLoginUserKeytabUsername())
                .name(getName())
                .note(getNote())
                .other(getOther())
                .password(getPassword())
                .port(getPort())
                .principal(getPrincipal())
                .type(getType())
                .userName(getUserName())
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
     * Class to build instances of {@link SparkDataSourceParamDTO}.
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
        private String type = "SparkDataSourceParamDTO";
        private String userName;
        private String database;
        private String host;
        private Integer id;
        private String javaSecurityKrb5Conf;
        private String loginUserKeytabPath;
        private String loginUserKeytabUsername;
        private String name;
        private String note;
        private Map<String, String> other;
        private String password;
        private Integer port;
        private String principal;
        private TypeEnum type = "SparkDataSourceParamDTO";
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
         * Setter for javaSecurityKrb5Conf.
         * @param  javaSecurityKrb5Conf  String value for javaSecurityKrb5Conf.
         * @return Builder
         */
        public Builder javaSecurityKrb5Conf(String javaSecurityKrb5Conf) {
            this.javaSecurityKrb5Conf = javaSecurityKrb5Conf;
            return this;
        }

        /**
         * Setter for loginUserKeytabPath.
         * @param  loginUserKeytabPath  String value for loginUserKeytabPath.
         * @return Builder
         */
        public Builder loginUserKeytabPath(String loginUserKeytabPath) {
            this.loginUserKeytabPath = loginUserKeytabPath;
            return this;
        }

        /**
         * Setter for loginUserKeytabUsername.
         * @param  loginUserKeytabUsername  String value for loginUserKeytabUsername.
         * @return Builder
         */
        public Builder loginUserKeytabUsername(String loginUserKeytabUsername) {
            this.loginUserKeytabUsername = loginUserKeytabUsername;
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
         * Setter for principal.
         * @param  principal  String value for principal.
         * @return Builder
         */
        public Builder principal(String principal) {
            this.principal = principal;
            return this;
        }

        /**
         * Setter for type.
         * @param  type  TypeEnum value for type.
         * @return Builder
         */
        public Builder type(TypeEnum type) {
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
         * Builds a new {@link SparkDataSourceParamDTO} object using the set fields.
         * @return {@link SparkDataSourceParamDTO}
         */
        public SparkDataSourceParamDTO build() {
            return new SparkDataSourceParamDTO(database, host, id, name, note, other, password,
                    port, type, userName, database, host, id, javaSecurityKrb5Conf,
                    loginUserKeytabPath, loginUserKeytabUsername, name, note, other, password, port,
                    principal, type, userName);
        }
    }
}
