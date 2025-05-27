# Parcel-Delivery
This Java console application models a basic parcel-delivery operation for a logistics company. It covers:

OOP Principles: abstract classes and concrete subclasses

Collections & Maps: grouping parcels by hub

Generics & Bounded Wildcards: type-safe bulk operations

Lambda Expressions & Streams: filtering and sorting

Generic Utility Methods: reusable list operations

Concurrency: dispatching parcels in parallel using Runnable and Thread

You’ll implement core domain types (Parcel, LocalParcel, InternationalParcel, Hub), a management service (Logistics), a utility swap method (Utils.swap), and a concurrent dispatcher (ParcelDispatcher). The Main class orchestrates all features.

Features
Abstract Parcel Model

Parcel (abstract) with String id and abstract double calcCost()

LocalParcel: cost = distance × ratePerKm

InternationalParcel: cost = baseFee + (weight × baseFee × customsRate)

Hub & Manifest

Hub class with proper equals/hashCode on name

Logistics maintains Map<Hub, List<Parcel>>

Single & Bulk Add

addParcel(Hub, Parcel)

addParcels(Hub, List<? extends Parcel>)

Stream-Based Filtering & Sorting

List<Parcel> filterAndSort(Hub, double minCost) uses Streams to return parcels costing more than minCost, sorted descending.

Generic Swap Utility

public static <T> void swap(List<T> list, int i, int j) with index checks.

Concurrent Dispatching

ParcelDispatcher implements Runnable: prints [Thread-Name] dispatched parcel: <id> (cost=XX.XX) with a brief delay.

Two threads process different parcel lists in parallel.

Main Application

Instantiates two hubs (“North”, “South”)

Populates each hub with parcels

Computes and prints total costs

Demonstrates filtering, swapping, and concurrent dispatch
