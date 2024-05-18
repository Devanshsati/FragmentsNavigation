# NavigationFragments Example

This project demonstrates the usage of Android Navigation Component to navigate between multiple fragments within an application. The project includes a `MainActivity` with buttons to switch between `BlankFragment1`, `BlankFragment2`, and `SettingsFragment` using navigation actions.

## Project Structure

### MainActivity

`MainActivity` sets up the navigation controller and handles button clicks to navigate between different fragments based on the current destination.

### Fragments

1. **BlankFragment1**:
   - Uses ViewBinding to bind its layout.
   - Contains a button to navigate to `SettingsFragment`.

2. **BlankFragment2**:
   - Uses ViewBinding to bind its layout.
   - Contains a button to navigate to `SettingsFragment`.

3. **SettingsFragment**:
   - Extends `PreferenceFragmentCompat` to display a settings screen from XML resources.

## Layout Files

1. **activity_main.xml**:
   - Contains a `NavHostFragment` with the ID `nav_host_fragment` to host the navigation.
   - Includes two buttons (`button1` and `button2`) to navigate between fragments.

2. **fragment_blank1.xml**:
   - Layout for `BlankFragment1`.
   - Contains a button (`button3`) to navigate to `SettingsFragment`.

3. **fragment_blank2.xml**:
   - Layout for `BlankFragment2`.
   - Contains a button (`button4`) to navigate to `SettingsFragment`.

4. **root_preferences.xml**:
   - Contains the preferences for `SettingsFragment`.

## Usage

1. **Setup Android Studio**:
   - Open the project in Android Studio.

2. **Run the App**:
   - Execute the app on an emulator or physical device.

3. **Navigate Between Fragments**:
   - Use the buttons in `MainActivity` to switch between `BlankFragment1`, `BlankFragment2`, and `SettingsFragment`.

## Navigation

- **nav_graph.xml**: Defines the navigation graph for the application. It includes actions to navigate between fragments.
  - `action_blankFragment1_to_blankFragment2`
  - `action_blankFragment2_to_blankFragment1`
  - `action_blankFragment1_to_settingsFragment`
  - `action_blankFragment2_to_settingsFragment`
  - `action_settingsFragment_to_blankFragment1`
  - `action_settingsFragment_to_blankFragment2`

## Dependencies

- **AndroidX Navigation Component**: Ensure your project includes the Navigation Component for fragment navigation.
- **ViewBinding**: Used for binding views in `BlankFragment1` and `BlankFragment2`.
- **Preference Library**: Used for creating the settings screen in `SettingsFragment`.

## Notes

- **Navigation Controller**: The `NavController` is used to manage app navigation within the `NavHostFragment`.
- **Navigation Actions**: Navigation between fragments is handled using defined actions in the navigation graph.
- **PreferenceFragmentCompat**: `SettingsFragment` uses `PreferenceFragmentCompat` to display a preferences screen.

This project serves as an example of using Android's Navigation Component to navigate between different fragments in a structured and manageable way.
