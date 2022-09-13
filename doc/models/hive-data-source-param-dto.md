
# Hive Data Source Param DTO

## Structure

`HiveDataSourceParamDTO`

## Inherits From

[`BaseDataSourceParamDTO`](../../doc/models/base-data-source-param-dto.md)

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Database` | `String` | Optional | - | String getDatabase() | setDatabase(String database) |
| `Host` | `String` | Optional | - | String getHost() | setHost(String host) |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `JavaSecurityKrb5Conf` | `String` | Optional | - | String getJavaSecurityKrb5Conf() | setJavaSecurityKrb5Conf(String javaSecurityKrb5Conf) |
| `LoginUserKeytabPath` | `String` | Optional | - | String getLoginUserKeytabPath() | setLoginUserKeytabPath(String loginUserKeytabPath) |
| `LoginUserKeytabUsername` | `String` | Optional | - | String getLoginUserKeytabUsername() | setLoginUserKeytabUsername(String loginUserKeytabUsername) |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `Note` | `String` | Optional | - | String getNote() | setNote(String note) |
| `Other` | `Map<String, String>` | Optional | - | Map<String, String> getOther() | setOther(Map<String, String> other) |
| `Password` | `String` | Optional | - | String getPassword() | setPassword(String password) |
| `Port` | `Integer` | Optional | - | Integer getPort() | setPort(Integer port) |
| `Principal` | `String` | Optional | - | String getPrincipal() | setPrincipal(String principal) |
| `Type` | [`TypeEnum`](../../doc/models/type-enum.md) | Optional | - | TypeEnum getType() | setType(TypeEnum type) |
| `UserName` | `String` | Optional | - | String getUserName() | setUserName(String userName) |

## Example (as JSON)

```json
{
  "database": null,
  "host": null,
  "id": null,
  "javaSecurityKrb5Conf": null,
  "loginUserKeytabPath": null,
  "loginUserKeytabUsername": null,
  "name": null,
  "note": null,
  "other": null,
  "password": null,
  "port": null,
  "principal": null,
  "userName": null,
  "type": "HiveDataSourceParamDTO"
}
```

