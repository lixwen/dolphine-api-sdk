
# Model and View

## Structure

`ModelAndView`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Empty` | `Boolean` | Optional | - | Boolean getEmpty() | setEmpty(Boolean empty) |
| `Model` | `Object` | Optional | - | Object getModel() | setModel(Object model) |
| `ModelMap` | `Map<String, Object>` | Optional | - | Map<String, Object> getModelMap() | setModelMap(Map<String, Object> modelMap) |
| `Reference` | `Boolean` | Optional | - | Boolean getReference() | setReference(Boolean reference) |
| `Status` | [`StatusEnum`](../../doc/models/status-enum.md) | Optional | - | StatusEnum getStatus() | setStatus(StatusEnum status) |
| `View` | [`View`](../../doc/models/view.md) | Optional | - | View getView() | setView(View view) |
| `ViewName` | `String` | Optional | - | String getViewName() | setViewName(String viewName) |

## Example (as JSON)

```json
{
  "empty": null,
  "model": null,
  "modelMap": null,
  "reference": null,
  "status": null,
  "view": null,
  "viewName": null
}
```

