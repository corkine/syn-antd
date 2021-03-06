# 4.17.2
- Bump dependencies
- Add Upload Dragger component. Thanks [@mjul](https://gitlab.com/mjul). See [PR7](https://gitlab.com/synqrinus/syn-antd/-/merge_requests/7)

# 4.13.1
- Add `Image.PreviewGroup` support via `image-preview-group`
- Add optional `class-fn` key to `ant-options` helper function that helps generate class names for options. Thanks [@madhat2r](https://gitlab.com/madhat2r). See [PR5](https://gitlab.com/synqrinus/syn-antd/-/merge_requests/5) 

# 4.8.5
- Add `Statistic.Countdown` support via `statistic-countdown`

# 4.7.4
- Add `-raw` components that are basic wrappers around antd input components without reagent async fixes. Largely for form support. Thanks [@maacl](https://gitlab.com/maacl). See [PR3](https://gitlab.com/synqrinus/syn-antd/-/merge_requests/3), see link for more details. 

# 4.7.3
- Fix for empty already being in core warning. Thanks [@mjul](https://gitlab.com/mjul). See [PR2](https://gitlab.com/synqrinus/syn-antd/-/merge_requests/2)

# 4.7.2
- Fix for list already being in core warning

# 4.7.0
- Add support for Image component
- Drop support for deprecated Button.Group component. antd changelog recommends using Space instead
- Remove no longer used Mention component. See Mentions for an alternative
- [syn-antd related]: Drop Icon component altogether, use specific paths for icons to allow for tree shaking

Miscellaneous:
- Fix docs deploy bug by bumping to latest version of react-syntax-highlight

# 4.5.1
- Add support for Badge.Ribbon component

# 4.4.2
- Fix datepicker namespace for parity with antd

# 4.4.1
- Add support for Skeleton.Image
- Fixed autocomplete namespace (dropping OptGroup, changing wrapper of input syncing)

# 4.3.1
- Add support for Typography.Link

# 4.2.2
- Add support for DatePicker quarter picker
- Add support for Space component
- Add support for Form.List
- Add support for Form.Provider
- Add support for Skeleton.Avatar
- Add support for Skeleton.Button
- Add support for Skeleton.Input

# 4.0.0-rc.1
- Add support for antd 4.0.0-rc.1
- BREAKING: syn-antd.icon is replaced with individual elements. See antd for full migration guide

## syn-antd specific migration guide

Note: there may be missing elements, this is as far as I noticed:

### Icons

The syn-antd.icon namespace is deprecated. While it displays, no icons will render. You will want to replace each icon with it's respective namespace under `syn-antd.icons`.

The benefit of this is tree shaking, i.e. significantly reduced package sizes. For example:

```
;; v3 icon
(require '[syn-antd.icon :as icon])
[icon/icon {:type "account-book"}]

;; v4 icon
(require '[syn-antd.icons.account-book-outlined :as account-book-outlined])
[account-book-outlined/account-book-outlined]
```

### Autocomplete

**Please use antd 4.0.0-rc.3 or higher to fix the issue described below**

autocomplete no longer seems to support setting a controlled value to nil. However, you can set it to an empty string. For example

```
(reset! state nil) ;; this won't work
(reset! state "") ;; this will work
``` 

autocomplete's styling has slightly been tweaked. To retain parity to v3 styling, add the following style parameters

```
{:width "100%"}
```


# 1.3.0
- Removed `syn-antd.input/r-input`. Add custom wrapper to handle sync/async problems
- Add demo test pages

# 1.2.1
- Added `syn-antd.input/r-input` to handle bug between reagent and syn-antd's usage of react.

There is a bug where if you modify a reagent atom that is used as the value for an antd input, it will update visually until the next re-render then reset back. This has to do with how antd sets state. It does not pick up on the new value change properly. r-input is a simple wrapper than, on update, sets the state of the antd input manually. It is meant to be performant so you can plug it in accordingly. 

# 1.2.0
- Fixed `syn-antd.form` not loading due to broken link | BREAKING: `syn-antd.form/form-form-item` must be renamed to `syn-antd.form/form-item`
- Added `syn-antd.input/input-password`

# 1.1.2
- Support new features added between antd 3.15.0 to 3.21.0

# 1.1.1-1

- Undo changes from `1.1.1`

# 1.1.1

- Work around async/sync change handling in react leading to cursor wonkiness with reagent. NOTE: Fairly hacky, can still be improved to more general form.

# 1.1.0

- Removed input-change-on-blur as was not really part of antd functionality.

# 1.0.4

- Initial open source release