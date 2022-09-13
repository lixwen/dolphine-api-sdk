
# Presto Data Source Param DTO

## Structure

`PrestoDataSourceParamDTO`

## Inherits From

[`BaseDataSourceParamDTO`](../../doc/models/base-data-source-param-dto.md)

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Database` | `String` | Optional | - | String getDatabase() | setDatabase(String database) |
| `Host` | `String` | Optional | - | String getHost() | setHost(String host) |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `Note` | `String` | Optional | - | String getNote() | setNote(String note) |
| `Other` | `Map<String, String>` | Optional | - | Map<String, String> getOther() | setOther(Map<String, String> other) |
| `Password` | `String` | Optional | - | String getPassword() | setPassword(String password) |
| `Port` | `Integer` | Optional | - | Integer getPort() | setPort(Integer port) |
| `Type` | [`TypeEnum`](../../doc/models/type-enum.md) | Optional | - | TypeEnum getType() | setType(TypeEnum type) |
| `UserName` | `String` | Optional | - | String getUserName() | setUserName(String userName) |

## Example (as JSON)

```json
{
  "database": null,
  "host": null,
  "id": null,
  "name": null,
  "note": null,
  "other": null,
  "password": null,
  "port": null,
  "userName": null,
  "type": "PrestoDataSourceParamDTO"
}
```

