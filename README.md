## Naming Conventions & Coding Standards

### 1. General Principles

- Use **Kotlin** and **Jetpack Compose** for Android development.
- Follow official [Kotlin Coding Conventions](https://kotlinlang.org/docs/coding-conventions.html).
- Prefer clear, descriptive names over abbreviations.
- Keep classes and functions focused on a single responsibility.
- Follow the existing project structure and naming patterns when adding new code.

### 2. Naming Rules

| Element | Convention | Example |
|---|---|---|
| Class / Object | `PascalCase` | `KalimbaViewModel` |
| Interface | `PascalCase` | `LessonRepository` |
| Function | `camelCase` | `playNote()` |
| Property / Variable | `camelCase` | `selectedLesson` |
| Constant | `UPPER_SNAKE_CASE` | `DEFAULT_TEMPO` |
| Enum class | `PascalCase` | `KeySide` |
| Enum entry | `UPPER_SNAKE_CASE` | `LEFT`, `RIGHT` |
| Package | lowercase | `com.chitmeo.kalimbatutor` |
| Resource file | lowercase with underscores | `kalimba_c4.wav` |
| Test class | Class name + `Test` | `KalimbaViewModelTest` |
| Test function | Descriptive behavior | `playNote_playsSelectedKey()` |

### 3. Jetpack Compose Conventions

- Name composable functions using `PascalCase`, like regular Kotlin functions that represent UI components.
- Use the `Screen` suffix for screen-level composables.
- Use descriptive names for reusable UI components.
- Keep UI rendering separate from business logic.

Examples:

```kotlin
@Composable
fun HomeScreen() {
    // Screen UI
}

@Composable
fun KalimbaKeyView(
    noteName: String,
    isSelected: Boolean
) {
    // Reusable key UI
}
```

### 4. Architecture & File Naming

Use a lightweight **MVVM + Clean Architecture** approach.

| Component | Naming pattern | Example |
|---|---|---|
| Screen | `*Screen.kt` | `HomeScreen.kt` |
| ViewModel | `*ViewModel.kt` | `HomeViewModel.kt` |
| UI state | `*UiState.kt` | `KalimbaUiState.kt` |
| UI event | `*UiEvent.kt` | `KalimbaUiEvent.kt` |
| Repository interface | `*Repository.kt` | `LessonRepository.kt` |
| Repository implementation | `*RepositoryImpl.kt` | `LessonRepositoryImpl.kt` |
| Use case | Verb + `UseCase` | `PlayNoteUseCase.kt` |
| Data model | Descriptive noun | `Lesson.kt`, `KalimbaKey.kt` |
| Data source | `*DataSource.kt` | `LessonJsonDataSource.kt` |

Guidelines:

- Keep repository interfaces in the domain layer and implementations in the data layer.
- Keep `ViewModel` responsible for UI state and coordinating user actions.
- Keep composables focused on rendering UI and forwarding user interactions.
- Introduce use cases only when they provide meaningful separation or reusable business logic.

### 5. Package Naming

- Use lowercase package names without underscores.
- Organize packages by feature and responsibility.
- Avoid putting unrelated classes into a single large package.

Example:

```text
com.chitmeo.kalimbatutor
├── core
│   ├── audio
│   ├── model
│   ├── ui
│   └── util
├── data
│   ├── lesson
│   └── settings
├── domain
│   ├── model
│   ├── repository
│   └── usecase
├── feature
│   ├── home
│   ├── kalimba
│   ├── lessons
│   ├── practice
│   └── settings
└── navigation
```

### 6. Constants & Configuration

- Declare true constants using `const val` where appropriate.
- Use descriptive names that explain the meaning of each value.
- Avoid scattering magic numbers throughout the code.

Example:

```kotlin
private const val DEFAULT_TEMPO = 80
private const val KALIMBA_KEY_COUNT = 17
```

### 7. Git & Code Quality

- Use descriptive branch names, such as `feature/kalimba-ui` or `fix/note-playback`.
- Keep commits focused on a single logical change.
- Do not commit secrets, local machine configuration, or generated build artifacts.
- Run relevant tests before submitting changes.
- Update documentation when behavior, architecture, or setup instructions change.
