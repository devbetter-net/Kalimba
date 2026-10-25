# Kalimba Tutor Android — MVP Sprint Planning

## 1. Project Overview

**Project:** Kalimba Tutor  
**Platform:** Android Native  
**Language:** Kotlin  
**UI Framework:** Jetpack Compose  
**Architecture:** MVVM + Lightweight Clean Architecture  
**Target:** Beginner Kalimba learners  
**Estimated Duration:** 6 weeks + 2–3 days for initial planning. (working days)
**Delivery Model:** Solo development, offline-first

### Product Vision

Build an Android application that helps beginners learn and play the Kalimba through a realistic wooden instrument interface, natural-sounding notes, guided lessons, and interactive practice.

The application must provide an adaptive playing experience:

- **Portrait mode:** Display the full Kalimba instrument.
- **Landscape mode:** Automatically zoom into the center keys to provide larger, more accessible touch targets.
- **Offline-first:** Core playing and learning features must work without an internet connection.
- **Local persistence:** Save learning progress and user preferences on the device.

### MVP Scope

- Virtual 17-key Kalimba instrument.
- Natural Kalimba sound samples.
- Responsive portrait and landscape layouts.
- Automatic landscape zoom and horizontal navigation.
- Beginner lessons and sample melodies.
- Guided note highlighting and practice playback.
- Local learning progress and favorites.
- Basic settings and release-ready APK.

### Out of Scope

- User accounts and cloud synchronization.
- AI-generated music.
- Microphone-based note recognition or automatic performance scoring.
- Online song marketplace.
- Subscription billing and advertisements.

---

## 2. Technology Stack

| Area | Technology |
|---|---|
| Language | Kotlin |
| UI | Jetpack Compose, Material 3 |
| State management | ViewModel, StateFlow |
| Dependency injection | Hilt |
| Navigation | Navigation Compose |
| Audio playback | SoundPool |
| Lesson content | JSON assets |
| Local preferences and progress | DataStore Preferences |
| Unit testing | JUnit |
| UI testing | Compose UI Test |
| Build system | Gradle Kotlin DSL |

**Architecture guidelines:**

- `feature/`: Feature-specific screens and ViewModels.
- `domain/`: Domain models, use cases, and repository interfaces.
- `data/`: Lesson loading and local persistence implementations.
- `core/audio/`: Audio engine abstraction and implementation.
- `core/designsystem/`: Shared colors, typography, themes, and UI components.
- Keep the initial implementation in a single Gradle application module. Split into additional modules only when justified.

---

## 3. Sprint 0 — Foundation & UX

**Duration:** 2–3 days  
**Sprint Goal:** Establish the project foundation, define the instrument configuration, and validate the core UX before feature implementation.

### Tasks

- [ ] **S0-01:** Create the Android project using Kotlin and Jetpack Compose.
- [ ] **S0-02:** Establish package structure, naming conventions, and coding standards.
- [ ] **S0-03:** Define the 17-key Kalimba tuning, note mapping, numbering, and visual positions.
- [ ] **S0-04:** Define portrait and landscape layouts, zoom behavior, and touch interaction rules.
- [ ] **S0-05:** Identify and evaluate suitable Kalimba sound samples with appropriate usage rights.
- [ ] **S0-06:** Initialize Git repository, README, and baseline build configuration.

### Acceptance Criteria

- [ ] The application builds and launches successfully.
- [ ] The 17-key configuration is documented and validated.
- [ ] Portrait and landscape wireframes are defined.
- [ ] The audio sample source and licensing requirements are understood.
- [ ] The initial project structure is documented.

**Deliverable:** A buildable Android project with validated product and technical requirements.

---

## 4. Sprint 1 — Sound Engine

**Duration:** 1 week  
**Sprint Goal:** Implement reliable playback for all 17 Kalimba notes before investing in the complete instrument UI.

### Tasks

- [ ] **S1-01:** Implement `KalimbaNote` and the instrument configuration.
- [ ] **S1-02:** Define the `KalimbaAudioEngine` interface.
- [ ] **S1-03:** Implement `SoundPoolAudioEngine`.
- [ ] **S1-04:** Prepare and map all 17 sound samples to their corresponding notes.
- [ ] **S1-05:** Support rapid consecutive note playback and evaluate overlapping sounds.
- [ ] **S1-06:** Implement audio loading, stopping, cleanup, and lifecycle management.
- [ ] **S1-07:** Create a temporary audio test screen.

### Acceptance Criteria

- [ ] Each configured note plays the correct sound sample.
- [ ] Sound samples are loaded once and reused during playback.
- [ ] Rapid consecutive taps do not freeze or block the UI.
- [ ] Audio resources are released appropriately.
- [ ] Playback latency and sound quality are tested on a physical Android device.
- [ ] Audio loading failures are handled gracefully.

**Deliverable:** A functional 17-note audio prototype.

**Technical note:** If SoundPool does not provide acceptable latency or playback behavior on target devices, evaluate a lower-level audio implementation before proceeding.

---

## 5. Sprint 2 — Responsive Kalimba UI

**Duration:** 1 week  
**Sprint Goal:** Build a realistic, interactive wooden Kalimba instrument that remains playable on small phone screens in both orientations.

### Tasks

- [ ] **S2-01:** Implement the wooden instrument body, bridge, and 17 tine visuals.
- [ ] **S2-02:** Display note numbers and note names on the tines.
- [ ] **S2-03:** Implement accurate touch hit-testing for each tine.
- [ ] **S2-04:** Add pressed-state feedback and subtle tine animations.
- [ ] **S2-05:** Implement portrait mode with a full-instrument overview.
- [ ] **S2-06:** Implement landscape mode with automatic zoom into the center keys.
- [ ] **S2-07:** Add horizontal panning to access outer keys.
- [ ] **S2-08:** Test touch accuracy across different screen sizes and orientations.

### Acceptance Criteria

- [ ] All 17 keys are interactive.
- [ ] Portrait mode displays the full instrument with appropriate proportions.
- [ ] Landscape mode enlarges the playable keys instead of shrinking the entire instrument.
- [ ] Touch coordinates remain accurate after zooming, panning, and orientation changes.
- [ ] System bars and navigation controls do not obstruct essential touch targets.
- [ ] The UI remains responsive during repeated interactions.

**Deliverable:** A fully playable virtual Kalimba with adaptive portrait and landscape layouts.

**UX decision:** Prioritize automatic landscape zoom and horizontal panning. Multi-touch pinch-to
